package com.mn.tabs.presentation.main

import android.text.TextUtils
import com.mn.tabs.data.persister.TabPersister
import com.mn.tabs.model.Tab
import java.util.*

class MainPresenter(
        val view: MainMvp.View,
        val tabPersister: TabPersister
) : MainMvp.Presenter {
    override fun onTabAdded(name: String) {
        if (isNameValid(name)) {
            persistTab(name)

        }
    }

    override fun onAddTabClicked() {
        view.showNewTabDialog()
    }

    //region private methods
    private fun persistTab(name: String) {
        tabPersister.addTab(name, Date().time)
    }

    private fun isNameValid(name: String): Boolean {
        return !TextUtils.isEmpty(name)
    }
    //endregion
}