package com.util.json.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.fasterxml.jackson.annotation.JacksonAnnotation;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface SegmentSetter {

	String segmentName() default "";
	
	String propertyName ();
}
