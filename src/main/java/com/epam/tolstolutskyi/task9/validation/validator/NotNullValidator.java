package com.epam.tolstolutskyi.task9.validation.validator;

import com.epam.tolstolutskyi.task9.validation.annotation.NotNull;

public class NotNullValidator extends AbstractValidator {

	public boolean validate(Object value, Object annotationObject) {
		return value != null;
	}

	public String getError(Object annotationObject) {
		NotNull annotation = (NotNull)annotationObject;
		return annotation.errorMessage();
	}

}
