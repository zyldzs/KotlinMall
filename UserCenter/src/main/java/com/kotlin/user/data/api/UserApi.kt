package com.kotlin.user.data.api


import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.protocol.RegisterReq
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by zhaokun on 2018/11/13.
 */
interface UserApi {
    

    @POST("userCenter/register")
    fun register(@Body req: RegisterReq):Observable<BaseResp<String>>
}