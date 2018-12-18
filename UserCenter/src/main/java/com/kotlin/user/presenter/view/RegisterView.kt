package com.kotlin.user.presenter.view

import com.kotlin.base.presenter.view.BaseView

/**
 * Created by zhaokun on 2018/11/9.
 */
interface RegisterView:BaseView {
    fun onRegisterResult(result:String)
}