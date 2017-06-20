package com.epam.tolstolutskyi.task9.validation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.epam.tolstolutskyi.task9.validation.validator.AbstractValidator;

@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateBy {
	Class<? extends AbstractValidator> validateBy();
}
