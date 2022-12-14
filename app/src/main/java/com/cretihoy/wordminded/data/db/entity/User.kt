package com.cretihoy.wordminded.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey
    val id: Long,

    @ColumnInfo
    val name: String,

    @ColumnInfo
    val score: Long
)