package com.kotlin.base.data.protocol

/**
 * Created by zhaokun on 2018/11/13.
 */
class BaseResp<out T>(val states:Int,val mesage:String,val data:T)