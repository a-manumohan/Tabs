package com.mn.tabs.presentation.main

import com.mn.tabs.presentation.main.viewmodel.PresentationTab

interface MainMvp {
    interface Presenter {
        fun onReady()
        fun onAddTabClicked()
        fun onTabAdded(name: String)
    }

    interface View {
        fun showNewTabDialog()
        fun showTabsList(tabs: List<PresentationTab>)
    }
}