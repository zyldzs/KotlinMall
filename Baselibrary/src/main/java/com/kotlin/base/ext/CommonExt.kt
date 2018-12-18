package com.kotlin.base.ext

import com.kotlin.base.rx.BaseObserver
import com.trello.rxlifecycle2.LifecycleProvider

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


/**
 * Created by zhaokun on 2018/11/12.
 */
fun <T> Observable<T>.execute(observer: BaseObserver<T>,lifecycleProvider: LifecycleProvider<*>){
    this.subscribeOn(Schedulers.io())
            .compose(lifecycleProvider.bindToLifecycle())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(observer)
}