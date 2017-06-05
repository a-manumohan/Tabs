package com.mn.tabs.di

import com.mn.tabs.presentation.main.MainComponent
import com.mn.tabs.presentation.main.MainModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(ApplicationModule::class))
@Singleton
interface ApplicationComponent {
    fun mainComponent(mainModule: MainModule): MainComponent
}