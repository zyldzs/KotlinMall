package com.kotlin.user.ui.activity

import android.os.Bundle
import android.util.Log
import com.kotlin.base.ui.activity.BaseMvpActivity
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


class RegisterActivity : BaseMvpActivity<RegisterPersenter>(),RegisterView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        initInjection()

        mRegisterBtn.setOnClickListener{
            mPersenter.register(mMobileEt.text.toString(),mVerifyCodeEt.text.toString(),mPwdEt.text.toString())
        }
    }

    private fun initInjection() {
        DaggerUserComponent.builder().userModule(UserModule()).build().inject(this)
        mPersenter.mView=this
    }

    override fun onRegisterResult(result: Boolean) {
        toast("成功")
    }
}
