package com.kotlin.user.service

import android.content.ContentProvider
import io.reactivex.Observable


/**
 * Created by zyldzs on 2018/11/11.
 */
interface UserService {
    fun  register(mobile:String,verifyCord:String,pwd:String):Observable<Boolean>
}