package com.epam.tolstolutskyi.task9.validation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.epam.tolstolutskyi.task9.validation.validator.NotNullValidator;

@Retention(RetentionPolicy.RUNTIME)
@ValidateBy(validateBy = NotNullValidator.class)
public @interface NotNull {
	String errorMessage() default "The value must not be null";
}
