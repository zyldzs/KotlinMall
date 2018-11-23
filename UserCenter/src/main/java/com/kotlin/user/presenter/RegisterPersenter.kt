package com.kotlin.user.presenter

import android.util.Log
import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseObserver
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


/**
 * Created by zhaokun on 2018/11/9.
 */
class RegisterPersenter : BasePresenter<RegisterView>() {

    fun register(mobile: String, verifyCode: String, pwd: String) {
        Log.e("11111","${mobile}${verifyCode}${pwd}")
        /*
        业务逻辑
         */
        val userService = UserServiceImpl()

        userService.register(mobile, verifyCode, pwd)
                .execute(object :BaseObserver<Boolean>(){
                    override fun onNext(t: Boolean) {
                        super.onNext(t)
                        mView.onRegisterResult(t)
                    }


                    override fun onError(e: Throwable) {
                        super.onError(e)
                        Log.e("11111111","错误")
                    }
                })

    }
}





