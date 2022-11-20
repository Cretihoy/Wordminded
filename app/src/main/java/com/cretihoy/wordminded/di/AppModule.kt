package com.cretihoy.wordminded.di

import com.cretihoy.wordminded.data.Storage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideStorage(): Storage {
        return Storage()
    }
}