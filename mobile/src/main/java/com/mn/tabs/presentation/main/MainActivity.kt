package com.mn.tabs.presentation.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mn.tabs.R
import com.mn.tabs.TabsApplication
import com.mn.tabs.presentation.main.dialog.AddTabDialog
import com.mn.tabs.presentation.main.view.AddTabView
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
        addTabDialog.show(supportFragmentManager, "add")
    }
    //endregion
}
