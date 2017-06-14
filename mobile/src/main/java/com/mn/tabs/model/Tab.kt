package com.mn.tabs.model

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Tab(
        @PrimaryKey var id: String = "",
        var name: String = "",
        var timestamp: Long = 0,
        var items: RealmList<TabItem> = RealmList()
) : RealmObject()
