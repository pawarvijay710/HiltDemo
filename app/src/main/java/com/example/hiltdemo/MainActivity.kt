package com.example.hiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltdemo.hiltinterface.EnglishQualifier
import com.example.hiltdemo.hiltinterface.MarathiQualifier
import com.example.hiltdemo.hiltinterface.Person
import com.example.hiltdemo.nohilt.EnglishPersonNoHilt
import com.example.hiltdemo.nohilt.MarathiPersonNoHilt
import com.example.hiltdemo.withhilt.MarathiPerson
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var marathiPersonNoHilt: MarathiPersonNoHilt
    private lateinit var englishPersonNoHilt: EnglishPersonNoHilt

    @Inject
    lateinit var marathiPerson: MarathiPerson

    @EnglishQualifier
    @Inject
    lateinit var intEnglishPersonNoHilt: Person

    @MarathiQualifier
    @Inject
    lateinit var intMarathiPersonNoHilt: Person

    // @AndroidEntryPoint has made an entrance. It identifies the dependency container. This is where
    // you will get your dependencies.
    // @AndroidEntryPoint annotates Activities, Fragments, Views, Services and BroadcastReceivers.
    // It turn them into dependency containers.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Nohilt
        englishPersonNoHilt = EnglishPersonNoHilt()
        marathiPersonNoHilt = MarathiPersonNoHilt(englishPersonNoHilt)
        marathiPersonNoHilt.speakMarathi()
        marathiPersonNoHilt.englishPersonNoHilt.speakEnglish()

        //With Hilt
        marathiPerson.speakMarathi()
        marathiPerson.englishPerson.speakEnglish()

        // with hilt interface
        // However, when you run your app, it crashes at compile time. Hilt is unable to implement
        // the interface. It does not know how to. Interfaces do not have constructors like classes
        // do. It is impossible to @Inject them.
        // You need to empower Hilt with the knowledge of how to implement an interface. Create an
        // abstract class with the following annotations:
        intEnglishPersonNoHilt.speakLanguage()
        intMarathiPersonNoHilt.speakLanguage()
    }
}