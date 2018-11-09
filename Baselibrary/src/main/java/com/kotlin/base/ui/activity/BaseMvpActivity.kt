package com.kotlin.base.ui.activity

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.presenter.view.BaseView

/**
 * Created by zhaokun on 2018/11/9.
 */
open class BaseMvpActivity<T:BasePresenter<*>> :BaseActivity(),BaseView{
    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }
    lateinit var mPersenter:T
}