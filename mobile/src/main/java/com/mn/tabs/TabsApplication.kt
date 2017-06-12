package com.mn.tabs

import android.app.Application
import com.mn.tabs.di.ApplicationComponent
import com.mn.tabs.di.DaggerApplicationComponent
import io.realm.Realm

class TabsApplication : Application() {
    var applicationComponent: ApplicationComponent? = null
    override fun onCreate() {
        super.onCreate()
        initRealm()
        initDi()
    }

    private fun initRealm() {
        Realm.init(this)
    }

    private fun initDi() {
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}