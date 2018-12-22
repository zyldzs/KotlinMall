package com.kotlin.user.ui.activity

import android.os.Bundle
import android.util.Log
import com.kotlin.base.common.AppManager
import com.kotlin.base.ui.activity.BaseMvpActivity
import com.kotlin.base.widgets.VerifyButton
import com.kotlin.user.R
import com.kotlin.user.injection.Component.DaggerUserComponent
import com.kotlin.user.injection.Component.UserComponent
import com.kotlin.user.injection.module.UserModule
import com.kotlin.user.presenter.RegisterPersenter
import com.kotlin.user.presenter.view.RegisterView
import dagger.internal.DaggerCollections
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.toast
import java.util.*


class RegisterActivity : BaseMvpActivity<RegisterPersenter>(),RegisterView {

    private var pressTime:Long=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mRegisterBtn.setOnClickListener{
            mPersenter.register(mMobileEt.text.toString(),mVerifyCodeEt.text.toString(),mPwdEt.text.toString())
        }
        mVerifyCodeBtn.setOnClickListener {
            mVerifyCodeBtn.requestSendVerifyNumber()
            toast("获取验证码")
        }

    }

    override fun injectComponent() {
        DaggerUserComponent.builder().activityComponent(activityCompontent).userModule(UserModule()).build().inject(this)
        mPersenter.mView=this
    }

    override fun onRegisterResult(result: String) {
        toast(result)
    }

    override fun onBackPressed() {
        val  time=System.currentTimeMillis()

        if (time-pressTime>2000){
            toast("再按一次退出程序")
            pressTime = time
        }else{
            AppManager.instance.exitApp(this)
        }
    }
}
