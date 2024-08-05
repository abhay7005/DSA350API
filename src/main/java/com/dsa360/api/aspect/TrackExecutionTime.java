package com.dsa360.api.aspect;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/*
 * 
 * Author :- Abhay
 * 
 * */
@Retention(RUNTIME)
@Target(ElementType.METHOD)
public @interface TrackExecutionTime {

}
