package com.kotlin.user.injection.Component

import android.support.v7.app.AppCompatActivity
import com.kotlin.user.injection.module.UserModule
import com.kotlin.user.ui.activity.RegisterActivity
import dagger.Component

/**
 * Created by zhaokun on 2018/12/6.
 */
@Component(modules = arrayOf(UserModule::class))
interface UserComponent {
    fun inject(activity: RegisterActivity)
}