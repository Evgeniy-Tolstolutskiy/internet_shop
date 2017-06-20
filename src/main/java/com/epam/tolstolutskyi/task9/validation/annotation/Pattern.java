package com.epam.tolstolutskyi.task9.validation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.epam.tolstolutskyi.task9.validation.validator.PatternValidator;

@Retention(RetentionPolicy.RUNTIME)
@ValidateBy(validateBy = PatternValidator.class)
public @interface Pattern {
	String pattern();
	String errorMessage() default "The value must match the pattern";
}
