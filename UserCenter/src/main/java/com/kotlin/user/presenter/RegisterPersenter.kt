package com.kotlin.user.presenter

import android.support.annotation.MainThread
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription

/**
 * Created by zhaokun on 2018/11/9.
 */
class RegisterPersenter:BasePresenter<RegisterView>() {

    fun register(mobile:String,verifyCode:String,pwd:String){
        /*
        业务逻辑
         */
        val userService=UserServiceImpl()

//        userService.register(mobile,verifyCode,pwd)
//                .observeOn(Schedulers.io())
//                .subscribeOn(AndroidSchedulers.mainThread())
//                .subscribe(object :Subscriber<Boolean>{
//                    override fun onError(t: Throwable?) {
//                    }
//
//                    override fun onComplete() {
//                    }
//
//                    override fun onSubscribe(s: Subscription?) {
//                    }
//
//                    override fun onNext(t: Boolean) {
//                        mView.onRegisterResult(t)
//                    }
//
//                })


    }
}

