package com.mn.tabs.presentation.main

import android.text.TextUtils
import com.mn.tabs.data.persister.TabPersister
import com.mn.tabs.presentation.main.viewmodel.PresentationTab
import java.util.*

class MainPresenter(
        val view: MainMvp.View,
        val tabPersister: TabPersister
) : MainMvp.Presenter {
    override fun onReady() {
        showTabs()
    }

    override fun onTabAdded(name: String) {
        if (isNameValid(name)) {
            persistTab(name)
            showTabs()
        }
    }

    override fun onAddTabClicked() {
        view.showNewTabDialog()
    }

    //region private methods
    private fun persistTab(name: String) {
        tabPersister.addTab(name, Date().time)
    }

    private fun showTabs() {
        val tabs = tabPersister.getAllTabs().map { tab ->
            PresentationTab(tab.id, tab.name)
        }
        view.showTabsList(tabs)
    }

    private fun isNameValid(name: String): Boolean {
        return !TextUtils.isEmpty(name)
    }
    //endregion
}