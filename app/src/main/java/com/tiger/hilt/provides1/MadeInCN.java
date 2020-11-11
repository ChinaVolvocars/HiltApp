package com.tiger.hilt.provides1;


import javax.inject.Qualifier;

import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
public @interface MadeInCN {
}
