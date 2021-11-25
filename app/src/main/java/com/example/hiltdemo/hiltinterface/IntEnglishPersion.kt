package com.example.hiltdemo.hiltinterface

import android.util.Log
import javax.inject.Inject

class IntEnglishPersion @Inject constructor(): Person {
    val tag = "EnglishPerson"

    override fun speakLanguage() {
        Log.d(tag, "Hilt-Int: Hello, How are you?")
    }
}