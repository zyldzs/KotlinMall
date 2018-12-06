package com.kotlin.base.injection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import javax.inject.Scope
import java.lang.annotation.RetentionPolicy.RUNTIME

/**
 * Created by zhaokun on 2018/12/6.
 */

@Scope
@Documented
@Retention(RUNTIME)
annotation class ActivityScope