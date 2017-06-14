package com.mn.tabs.presentation.main

interface MainMvp {
    interface Presenter {
        fun onAddTabClicked()
        fun  onTabAdded(name: String)
    }

    interface View {
        fun showNewTabDialog()
    }
}