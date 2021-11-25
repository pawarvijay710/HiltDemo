package com.example.hiltdemo.hiltinterface

import android.util.Log
import javax.inject.Inject

class IntMarathiPerson @Inject constructor(): Person{
    val tag = "MarathiPerson"

    override fun speakLanguage() {
        Log.d(tag, "Hilt-Int: Namskar, Tumhi kase aahat?")
    }
}