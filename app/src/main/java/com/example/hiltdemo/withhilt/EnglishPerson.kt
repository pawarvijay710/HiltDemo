package com.example.hiltdemo.withhilt

import android.util.Log
import javax.inject.Inject

class EnglishPerson @Inject constructor() {
    val tag = "EnglishPerson"
    // @Inject gives Hilt access to EnglishPerson's constructor. This means that now Hilt can
    // generate instances of EnglishPerson.
    //
    // @Inject here has a different purpose. It identifies the injectable field. Injectable means
    // that Hilt can supply the instantiated dependencies to it. Note that you now don’t have
    // to instantiate the EnglishPerson() class.

    fun speakEnglish(){
        Log.d(tag, "Hello, How are you?")
    }
}