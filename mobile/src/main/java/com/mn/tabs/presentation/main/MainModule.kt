package com.mn.tabs.presentation.main

import com.mn.tabs.di.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class MainModule(val view: MainMvp.View) {
    @Provides
    @ActivityScope
    fun providePresenter(): MainMvp.Presenter = MainPresenter(view)
}