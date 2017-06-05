package com.mn.tabs.presentation.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mn.tabs.R
import com.mn.tabs.TabsApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainMvp.View {

    @Inject
    var presenter: MainMvp.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupDi()
    }

    private fun setupDi() {
        (application as TabsApplication)
                .applicationComponent
                ?.mainComponent(MainModule(this))
                ?.inject(this)
    }
}
