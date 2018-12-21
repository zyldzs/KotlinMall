package com.kotlin.base.rx

import com.kotlin.base.presenter.view.BaseView
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription

/**
 * Created by zhaokun on 2018/11/12.
 */
open class BaseObserver<T>(val baseView:BaseView) :Observer<T> {
    override fun onError(e: Throwable) {
        baseView.hideLoading()
    }

    override fun onSubscribe(d: Disposable) {

    }

    override fun onNext(t: T) {

    }

    override fun onComplete() {
        baseView.hideLoading()
    }


}