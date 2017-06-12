package com.mn.tabs.presentation.main

import com.mn.tabs.di.ActivityScope
import dagger.Module
import dagger.Provides
import io.realm.Realm

@Module
class MainModule(val view: MainMvp.View) {
    @Provides
    @ActivityScope
    fun providePresenter(realm: Realm): MainMvp.Presenter = MainPresenter(view, realm)
}