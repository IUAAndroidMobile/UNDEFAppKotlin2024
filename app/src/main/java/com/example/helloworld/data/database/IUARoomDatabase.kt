package com.example.helloworld.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ColorTable::class], version = 1)
abstract class IUARoomDatabase : RoomDatabase() {
    abstract fun ColorDao(): ColorDao

    companion object {
        @Volatile
        private var INSTANCE: IUARoomDatabase? = null

        fun getInstance(context: Context): IUARoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    IUARoomDatabase::class.java,
                    "IUARoomDatabase"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
