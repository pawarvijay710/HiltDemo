package com.example.hiltdemo.withhilt

import android.util.Log
import javax.inject.Inject

class MarathiPerson @Inject constructor(val englishPerson: EnglishPerson){
    val tag = "MarathiPerson"

    // @Inject here serves the same purpose as in EnglishPerson.
    // It gives Hilt access to MarathiPersopn's constructor. Hilt can then generate an instance
    // of MarathiPersion
    //
    // However, it’s not as simple as the first case. To create MarathiPerson, it also needs to create
    // EnglishPerson. This is because MarathiPerson requires EnglishPerson as a parameter in its
    // constructor.
    // Hilt already knows how to create EnglishPerson. Instances that Hilt knows how to create go
    // by the name bindings. So EnglishPerson and MarathiPerson are bindings.

    fun speakMarathi(){
        Log.d(tag, "Namaskar, Tumhi kase aahat?")
    }
}