package com.kotlin.base.ext

import com.kotlin.base.rx.BaseObserver
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


/**
 * Created by zhaokun on 2018/11/12.
 */
fun <T> Observable<T>.execute(observer: BaseObserver<T>){
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(observer)
}