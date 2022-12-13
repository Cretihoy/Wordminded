package com.cretihoy.wordminded.di

import android.content.Context
import androidx.room.Room
import com.cretihoy.wordminded.compose.presentation.screen.users.UserMapper
import com.cretihoy.wordminded.compose.presentation.screen.users.UserModelFactory
import com.cretihoy.wordminded.compose.presentation.screen.users.UserRepository
import com.cretihoy.wordminded.data.Storage
import com.cretihoy.wordminded.data.db.AppDatabase
import com.cretihoy.wordminded.data.db.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDao(
        db: AppDatabase
    ): UserDao {
        return db.userDao()
    }

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context,
    ): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java, "database-name"
        ).build()
    }

    @Provides
    @Singleton
    fun provideRepository(
        database: UserDao,
        mapper: UserMapper,
        factory: UserModelFactory
    ): UserRepository {
        return UserRepository(
            database,
            mapper,
            factory
        )
    }

    @Provides
    @Singleton
    fun provideStorage(): Storage {
        return Storage()
    }
}