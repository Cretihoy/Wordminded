package com.cretihoy.wordminded.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.cretihoy.wordminded.data.db.entity.User

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE id == :id LIMIT 1")
    fun getById(id: Long): User

    @Query("SELECT * FROM user WHERE name LIKE :name LIMIT 1")
    fun getByName(name: String): User

    @Insert
    fun add(user: User)

    @Insert
    fun addList(vararg users: User)

    @Delete
    fun remove(user: User)
}