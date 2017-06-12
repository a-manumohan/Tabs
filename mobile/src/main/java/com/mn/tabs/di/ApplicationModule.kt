package com.mn.tabs.di

import com.mn.tabs.data.persister.TabPersisterImpl
import dagger.Module
import dagger.Provides
import io.realm.Realm
import io.realm.RealmConfiguration
import javax.inject.Singleton

@Module
class ApplicationModule {
    @Provides
    @Singleton
    fun provideRealmConfiguration() = RealmConfiguration.Builder().build()

    @Provides
    @Singleton
    fun provideRealm(config: RealmConfiguration) = Realm.getInstance(config)

    @Provides
    @Singleton
    fun provideTabPersister(realm: Realm) = TabPersisterImpl(realm)
}