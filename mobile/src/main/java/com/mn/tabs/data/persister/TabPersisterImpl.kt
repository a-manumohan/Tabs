package com.mn.tabs.data.persister

import com.mn.tabs.model.Tab
import com.mn.tabs.model.TabItem
import io.realm.Realm
import io.realm.RealmResults
import io.realm.Sort
import java.util.*

class TabPersisterImpl(val realm: Realm) : TabPersister {
    override fun addTab(name: String, timestamp: Long): Tab {
        realm.beginTransaction()
        val realmTab = realm.createObject(Tab::class.java, getUniqueTabId())
        realmTab.name = name
        realmTab.timestamp = timestamp
        realm.commitTransaction()
        return realmTab
    }

    override fun removeTab(tab: Tab) {
        realm.beginTransaction()
        val realmTab = realm.where(Tab::class.java)
                .equalTo("id", tab.id)
                .findFirst()
        realmTab.deleteFromRealm()
        realm.commitTransaction()
    }

    override fun addItem(tab: Tab, item: TabItem) {
        realm.executeTransaction {
            val realmItem = realm.copyFromRealm(item)
            tab.items.add(realmItem)
        }
    }

    override fun removeItem(tab: Tab, item: TabItem) {
        realm.executeTransaction {
            val realmItem = realm.where(TabItem::class.java)
                    .equalTo("id", item.id)
                    .findFirst()
            realmItem.deleteFromRealm()
        }
    }

    override fun getAllTabs(): RealmResults<Tab> {
        return realm.where(Tab::class.java)
                .findAllSorted("timestamp", Sort.DESCENDING)
    }

    override fun getTab(id: Long): Tab {
        return realm.where(Tab::class.java)
                .equalTo("id", id)
                .findFirst()
    }


    private fun getUniqueTabId(): String {
        return UUID.randomUUID().toString()
    }
}
