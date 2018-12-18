package com.kotlin.user.service.impl

import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.base.rx.BaseException
import com.kotlin.user.data.Repository.UserRepository
import com.kotlin.user.service.UserService
import io.reactivex.Observable
import io.reactivex.functions.Function
import javax.inject.Inject


/**
 * Created by zyldzs on 2018/11/11.
 */
class UserServiceImpl @Inject constructor():UserService {

    @Inject
    lateinit var repository:UserRepository
    override fun register(mobile: String, verifyCord: String, pwd: String): Observable<Boolean> {

        return  repository.register(mobile,pwd,verifyCord )
                .flatMap(object : Function<BaseResp<String>, Observable<Boolean>>{
                    override fun apply(t: BaseResp<String>): Observable<Boolean> {
                        if (t.states!=0){
                            return Observable.error(BaseException(t.states,t.mesage))
                        }
                        return Observable.just(true)
                    }
                })
    }
}