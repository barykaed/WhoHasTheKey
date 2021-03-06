package com.kishorebabu.android.whohasthekey.injection.module

import android.app.Application
import android.content.Context
import com.kishorebabu.android.whohasthekey.injection.ApplicationContext
import dagger.Module
import dagger.Provides

@Module(includes = arrayOf(ApiModule::class))
class AppModule(private val application: Application) {

    @Provides
    internal fun provideApplication(): Application {
        return application
    }

    @Provides
    @ApplicationContext
    internal fun provideContext(): Context {
        return application
    }
}