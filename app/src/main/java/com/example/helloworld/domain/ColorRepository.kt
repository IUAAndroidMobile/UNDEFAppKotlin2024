package com.example.helloworld.domain

import com.example.helloworld.MyApplication
import com.example.helloworld.data.database.ColorDao
import com.example.helloworld.data.database.ColorTable
import com.example.helloworld.data.database.IUARoomDatabase

class ColorRepository {

    lateinit var colorDao: ColorDao

    init {
        val database: IUARoomDatabase = MyApplication.myIUARoomDatabase
        colorDao = database.ColorDao()
    }

    fun insertColor(color: ColorTable) {
        colorDao.insert(color)
    }

    fun getAllColors() : List<ColorTable> {
        return colorDao.getAllColorsOrdered()
    }

}
