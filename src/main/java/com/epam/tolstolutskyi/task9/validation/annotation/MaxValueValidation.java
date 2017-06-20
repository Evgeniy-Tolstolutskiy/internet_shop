package com.epam.tolstolutskyi.task9.validation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.epam.tolstolutskyi.task9.validation.validator.MaxValueValidator;

@Retention(RetentionPolicy.RUNTIME)
@ValidateBy(validateBy = MaxValueValidator.class)
public @interface MaxValueValidation {
	int value();
	String errorMessage() default "The value must be less than specified value";
}
