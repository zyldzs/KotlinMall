package com.kotlin.base.common

import android.app.Application
import android.content.Context
import com.kotlin.base.injection.component.AppComponent
import com.kotlin.base.injection.component.DaggerActivityComponent
import com.kotlin.base.injection.component.DaggerAppComponent
import com.kotlin.base.injection.module.AppModule

/**
 * Created by zhaokun on 2018/12/6.
 */
class BaseApplication:Application() {

     lateinit var appComponent:AppComponent
    override fun onCreate() {
        super.onCreate()
        initAppInjection()
        context=this
    }

    private fun initAppInjection() {
        appComponent=DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
    companion object {
        lateinit var context:Context
    }
}