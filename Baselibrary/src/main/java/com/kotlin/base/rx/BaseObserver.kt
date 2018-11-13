package com.kotlin.base.rx

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription

/**
 * Created by zhaokun on 2018/11/12.
 */
open class BaseObserver<T> :Observer<T> {
    override fun onError(e: Throwable) {
    }

    override fun onSubscribe(d: Disposable) {
    }

    override fun onNext(t: T) {
    }

    override fun onComplete() {
    }


}