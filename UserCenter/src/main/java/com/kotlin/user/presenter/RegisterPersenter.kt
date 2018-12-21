package com.kotlin.user.presenter

import android.util.Log
import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseObserver
import com.kotlin.base.utils.NetWorkUtils
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.UserService
import com.kotlin.user.service.impl.UserServiceImpl
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


/**
 * Created by zhaokun on 2018/11/9.
 */
class RegisterPersenter @Inject constructor() : BasePresenter<RegisterView>() {


    @Inject
    lateinit var userService: UserService
    fun register(mobile: String, verifyCode: String, pwd: String) {
        /**
        业务逻辑
         */
        if (!checkNetwork()){
            print("没有网络连接")
            return
        }
        mView.showLoading()
        userService.register(mobile, verifyCode, pwd)
                .execute(object :BaseObserver<Boolean>(mView){
                    override fun onNext(t: Boolean) {
                        super.onNext(t)
                        if (t)
                        mView.onRegisterResult("成功")
                    }
                },lifecycleProvider)
    }
}





