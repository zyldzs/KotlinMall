package com.kotlin.user.data.Repository

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.RegisterReq
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by zhaokun on 2018/11/13.
 */
class UserRepository @Inject constructor(){

    fun register(mobile:String,pwd:String,verifyCode:String):Observable<BaseResp<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterReq(mobile,pwd,verifyCode))
    }
}