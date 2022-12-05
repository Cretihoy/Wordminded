package com.cretihoy.wordminded.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cretihoy.wordminded.data.db.dao.UserDao
import com.cretihoy.wordminded.data.db.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
}