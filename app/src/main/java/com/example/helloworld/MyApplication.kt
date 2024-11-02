package com.example.helloworld

import android.app.Application
import android.content.Context
import com.example.helloworld.data.database.IUARoomDatabase

class MyApplication: Application() {

    companion object {
        lateinit var myIUARoomDatabase: IUARoomDatabase
        lateinit var myApplicationContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        myApplicationContext = applicationContext
        myIUARoomDatabase = IUARoomDatabase.getInstance(this)
    }
}
