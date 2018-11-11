package com.kotlin.user.service.impl

import com.kotlin.user.service.UserService
import io.reactivex.Observable

/**
 * Created by zyldzs on 2018/11/11.
 */
class UserServiceImpl:UserService {
    override fun register(mobile: String, verifyCord: String, pwd: String): Observable<Boolean> {
        return   Observable.just(true)
    }
}