package com.kishorebabu.android.whohasthekey.injection.module

import android.app.Activity
import android.content.Context
import com.kishorebabu.android.whohasthekey.injection.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    internal fun provideActivity(): Activity {
        return activity
    }

    @Provides
    @ActivityContext
    internal fun providesContext(): Context {
        return activity
    }
}
