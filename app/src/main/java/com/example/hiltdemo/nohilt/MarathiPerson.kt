package com.example.hiltdemo.nohilt

import android.util.Log

class MarathiPersonNoHilt(val englishPersonNoHilt: EnglishPersonNoHilt){
    val tag = "MarathiPerson"

    // Since english is global language, we need Marathi person to learn it
    //Following is no advisable because It violates the Single Responsibility Principle:
    // A MarathiPerson class should not concern itself with English matters!
    //       val englishPerson = EnglishPerson()
    //
    // This is where dependency injection comes in.
    // It turns out that setting up your code in this manner has several benefits. When the Maratha
    // learns a new language, you simply add it to the constructor.
    //
    // You don’t have to keep changing the code inside MarathiPerson class. The code is thus,
    // more maintainable and flexible. This also makes it more testable and scalable.

    fun speakMarathi(){
        Log.d(tag, "NoHilt: Namaskar, Tumhi kase aahat?")
    }
}