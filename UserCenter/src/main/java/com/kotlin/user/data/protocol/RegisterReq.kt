package com.kotlin.user.data.protocol

import com.kotlin.base.data.protocol.BaseResp

/**
 * Created by zhaokun on 2018/11/13.
 */
data class RegisterReq(val mobile:String,val pwd:String,val verifyCode:String)