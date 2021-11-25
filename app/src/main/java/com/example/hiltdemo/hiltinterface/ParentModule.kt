package com.example.hiltdemo.hiltinterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

// A module informs Hilt how to provide dependencies when it cannot access the constructor.
// @Module is used to identify modules.
// @InstallIn(ActivityComponent) declares that the following implementation will be alive only as
// long as the activity is active. The activity is, therefore, the component.
// @Binds tells Hilt which implementation to use when it needs to provide an instance of an
// interface. The information on how to provide the implementation is in the function parameters.
@Module
@InstallIn(ActivityComponent::class)
abstract class ParentModule {

    @EnglishQualifier
    @Binds
    abstract fun EnglishPersonImpl(intEnglishPersion: IntEnglishPersion): Person

    @MarathiQualifier
    @Binds
    abstract fun MarathiPersonImpl(intMarathiPersion: IntMarathiPerson): Person
}

@Qualifier
annotation class EnglishQualifier

@Qualifier
annotation class MarathiQualifier