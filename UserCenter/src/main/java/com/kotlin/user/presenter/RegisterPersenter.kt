package com.kotlin.user.presenter

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.presenter.view.RegisterView

/**
 * Created by zhaokun on 2018/11/9.
 */
class RegisterPersenter:BasePresenter<RegisterView>() {

    fun register(mobile:String,verifyCode:String){
        /*
        业务逻辑
         */
        mView.onRegisterResult(true)
    }
}