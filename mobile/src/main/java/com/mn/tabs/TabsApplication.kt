package com.mn.tabs

import android.app.Application
import com.mn.tabs.di.ApplicationComponent
import com.mn.tabs.di.DaggerApplicationComponent

class TabsApplication : Application() {
    var applicationComponent: ApplicationComponent? = null
    override fun onCreate() {
        super.onCreate()
        initDi()
    }

    private fun initDi() {
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}