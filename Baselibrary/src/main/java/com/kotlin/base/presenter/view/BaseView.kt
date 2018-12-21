package com.kotlin.base.presenter.view

/**
 * Created by zhaokun on 2018/11/9.
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(text:String)
}