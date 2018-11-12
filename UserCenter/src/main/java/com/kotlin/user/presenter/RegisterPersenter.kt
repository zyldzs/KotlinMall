package com.kotlin.user.presenter

import android.support.annotation.MainThread
import android.util.Log
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers


/**
 * Created by zhaokun on 2018/11/9.
 */
class RegisterPersenter : BasePresenter<RegisterView>() {

    fun register(mobile: String, verifyCode: String, pwd: String) {
        /*
        业务逻辑
         */
        val userService = UserServiceImpl()

        userService.register(mobile, verifyCode, pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(  // named arguments for lambda Subscribers
                onNext = {
                    Log.e("111111",Thread.currentThread().name)
                    mView.onRegisterResult(it)
                },
                onError =  { it.printStackTrace() },
                onComplete = { println("Done!") }
        )

    }
}





