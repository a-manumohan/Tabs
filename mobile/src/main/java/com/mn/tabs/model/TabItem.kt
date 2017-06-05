package com.mn.tabs.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class TabItem(
        @PrimaryKey var id: Long = 0,
        var amount: Double = 0.0,
        var timestamp: Long = 0,
        var note: String = ""
) : RealmObject()
