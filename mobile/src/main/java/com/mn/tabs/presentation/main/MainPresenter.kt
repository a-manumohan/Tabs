package com.mn.tabs.presentation.main

import io.realm.Realm

class MainPresenter(
        val view: MainMvp.View,
        val realm: Realm
) : MainMvp.Presenter {
    override fun addTabClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}