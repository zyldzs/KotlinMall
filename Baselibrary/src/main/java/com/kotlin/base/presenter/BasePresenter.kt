package com.kotlin.base.presenter

import com.kotlin.base.presenter.view.BaseView

/**
 * Created by zhaokun on 2018/11/9.
 */
open class BasePresenter<T:BaseView>{
    lateinit var mView:T

}