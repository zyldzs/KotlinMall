package com.kotlin.base.rx

import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription

/**
 * Created by zhaokun on 2018/11/12.
 */
open class BaseSubscriber<T> :Subscriber<T> {
    override fun onNext(t: T) {

    }

    override fun onSubscribe(s: Subscription?) {
    }

    override fun onError(t: Throwable?) {
    }

    override fun onComplete() {
    }
}