package com.mn.tabs.presentation.main

import io.realm.Realm

class MainPresenter(
        val view: MainMvp.View,
        val realm: Realm
) : MainMvp.Presenter {
    override fun onTabAdded(name: String) {
    }

    override fun onAddTabClicked() {
      view.showNewTabDialog()
    }
}