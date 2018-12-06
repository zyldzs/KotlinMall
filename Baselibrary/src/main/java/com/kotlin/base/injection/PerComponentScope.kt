package com.kotlin.base.injection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * Created by zhaokun on 2018/12/6.
 */

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class PerComponentScope