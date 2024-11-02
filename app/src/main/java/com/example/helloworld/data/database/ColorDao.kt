package com.example.helloworld.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ColorDao {

    @Insert
    fun insert(color: ColorTable)

    @Query("DELETE FROM color_table")
    fun deleteAll()

    @Query("SELECT * FROM color_table ORDER BY color_name ASC")
    fun getAllColorsOrdered() : List<ColorTable>

    @Query("SELECT * FROM color_table WHERE color_name == :colorName")
    fun getColorByName(colorName: String): ColorTable
}
