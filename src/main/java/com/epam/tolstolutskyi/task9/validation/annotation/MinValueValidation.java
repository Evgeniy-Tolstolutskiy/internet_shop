package com.epam.tolstolutskyi.task9.validation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.epam.tolstolutskyi.task9.validation.validator.MinValueValidator;

@Retention(RetentionPolicy.RUNTIME)
@ValidateBy(validateBy = MinValueValidator.class)
public @interface MinValueValidation {
	int value();
	String errorMessage() default "The value must be greater than specified value";
}
