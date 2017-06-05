package com.mn.tabs.model

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Tab(
        @PrimaryKey var id:Long = 0,
        var name: String = "",
        var timestamp: Long = 0,
        var items: RealmList<TabItem> = RealmList()
) : RealmObject()
