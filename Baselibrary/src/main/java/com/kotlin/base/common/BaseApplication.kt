package com.kotlin.base.common

import android.app.Application
import com.kotlin.base.injection.component.DaggerAppComponent

/**
 * Created by zhaokun on 2018/12/6.
 */
class BaseApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        initAppInjection()
    }

    private fun initAppInjection() {

    }
}