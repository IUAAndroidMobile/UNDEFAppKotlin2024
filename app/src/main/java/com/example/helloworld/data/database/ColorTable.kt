package com.example.helloworld.data.database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "color_table")
data class ColorTable(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name="color_name")
    val name: String,
    val hex: String
)
