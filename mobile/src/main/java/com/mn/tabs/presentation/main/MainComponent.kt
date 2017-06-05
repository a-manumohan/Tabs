package com.mn.tabs.presentation.main

import com.mn.tabs.di.ActivityScope
import dagger.Subcomponent

@Subcomponent(modules = arrayOf(MainModule::class))
@ActivityScope
interface MainComponent {
    fun inject(activity: MainActivity)
}