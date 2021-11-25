package com.example.hiltdemo.nohilt

import android.util.Log

class EnglishPersonNoHilt {
    val tag = "EnglishPerson"
    fun speakEnglish(){
        Log.d(tag, "NoHilt: Hello, How are you?")
    }
}