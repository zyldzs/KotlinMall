package com.kotlin.base.injection.module

import android.app.Activity
import android.content.Context
import com.kotlin.base.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by zhaokun on 2018/12/6.
 */
@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    @Singleton
    fun providesActivity(): Activity {
        return activity
    }
}