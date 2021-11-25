package com.example.hiltdemo.withhilt

import android.app.Application
import android.util.Log
import com.google.gson.Gson
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication: Application() {

    @Inject
    lateinit var gson: Gson

    override fun onCreate() {
        super.onCreate()
        Log.i("MyApplicationGson", gson.toString())
    }
}