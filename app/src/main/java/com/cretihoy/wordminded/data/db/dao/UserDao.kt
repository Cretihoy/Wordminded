package com.cretihoy.wordminded.data.db.dao

import androidx.room.*
import com.cretihoy.wordminded.data.db.entity.User

@Dao
interface UserDao {

    @Transaction
    @Query("SELECT * FROM user")
    suspend fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE id == :id LIMIT 1")
    suspend fun getById(id: Long): User

    @Query("SELECT * FROM user WHERE name LIKE :name LIMIT 1")
    suspend fun getByName(name: String): User

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun add(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addList(vararg users: User)

    @Delete
    suspend fun remove(user: User)
}