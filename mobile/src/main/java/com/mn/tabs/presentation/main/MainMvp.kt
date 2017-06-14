package com.mn.tabs.presentation.main

interface MainMvp {
    interface Presenter {
        fun onAddTabClicked()
    }

    interface View {
        fun showNewTabDialog()
    }
}