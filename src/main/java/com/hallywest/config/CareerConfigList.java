package com.hallywest.config;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface CareerConfigList {
	CareerConfig[] value();
}

@interface CareerConfig {
	String name();
	double hpInc();
	double mpInc();
	double powInc();
	double sptInc();
	double staInc();
	double actInc();
}
