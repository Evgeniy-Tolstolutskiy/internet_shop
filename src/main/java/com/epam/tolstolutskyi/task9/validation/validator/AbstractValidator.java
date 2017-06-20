package com.epam.tolstolutskyi.task9.validation.validator;

public abstract class AbstractValidator {
	public abstract boolean validate(Object value, Object annotationObject);
	
	public abstract String getError(Object annotationObject);
}
