package com.mn.tabs.data.persister

import com.mn.tabs.model.Tab
import com.mn.tabs.model.TabItem
import io.realm.RealmResults

interface TabPersister {
    fun addTab(name: String, timestamp: Long): Tab

    fun removeTab(tab: Tab)

    fun addItem(tab: Tab, item: TabItem)

    fun removeItem(tab: Tab, item: TabItem)

    fun getAllTabs(): RealmResults<Tab>

    fun getTab(id: Long): Tab
}
