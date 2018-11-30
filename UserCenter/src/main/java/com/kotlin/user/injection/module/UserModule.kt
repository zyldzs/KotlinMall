package com.kotlin.user.injection.module

import com.kotlin.user.service.UserService
import com.kotlin.user.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by zhaokun on 2018/11/30.
 */

@Module
class UserModule {
    @Provides
    fun providesUserService(service: UserServiceImpl):UserService{
        return service
    }
}