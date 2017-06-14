package com.mn.tabs.presentation.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mn.tabs.R
import com.mn.tabs.TabsApplication
import com.mn.tabs.presentation.main.adapter.TabsAdapter
import com.mn.tabs.presentation.main.dialog.AddTabDialog
import com.mn.tabs.presentation.main.view.AddTabView
import com.mn.tabs.presentation.main.viewmodel.PresentationTab
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainMvp.View {

    @Inject
    lateinit var presenter: MainMvp.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupDi()
        setupListeners()
        presenter.onReady()
    }

    private fun setupDi() {
        (application as TabsApplication)
                .applicationComponent
                ?.mainComponent(MainModule(this))
                ?.inject(this)
    }

    private fun setupListeners() {
        add_tab.setOnClickListener {
            presenter.onAddTabClicked()
        }
    }

    //region view methods
    override fun showNewTabDialog() {
        val addTabDialog = AddTabDialog()
        addTabDialog.onTabAdded { name -> presenter.onTabAdded(name) }
        addTabDialog.show(supportFragmentManager, "add_tab")
    }

    override fun showTabsList(tabs: List<PresentationTab>) {
        tabs_listview.bind(tabs)
    }
    //endregion
}
