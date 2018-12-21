package com.kotlin.base.presenter

import android.content.Context
import com.kotlin.base.presenter.view.BaseView
import com.kotlin.base.utils.NetWorkUtils
import com.trello.rxlifecycle2.LifecycleProvider

import javax.inject.Inject

/**
 * Created by zhaokun on 2018/11/9.
 */
open class BasePresenter<T : BaseView> {



    lateinit var mView: T

    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

    @Inject
    lateinit var context:Context

    fun checkNetwork():Boolean{
        return NetWorkUtils.isNetWorkAvailable(context)
    }
}