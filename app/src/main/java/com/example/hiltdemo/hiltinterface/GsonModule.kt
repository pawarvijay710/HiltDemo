package com.example.hiltdemo.hiltinterface

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//  Through @Provides, the annotated function gives Hilt the following information:
//      - The return type tells Hilt what type the function provides instances of.
//      - The parameters tell Hilt the dependencies required to provide the type. In our case,
//      there are none.
//      - The function body tells Hilt how to provide an instance of the corresponding type.
//      Hilt executes the function body every time it needs to provide an instance of that type.
@Module
@InstallIn(SingletonComponent::class)
class GsonModule {

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return Gson()
    }
}