package com.epam.tolstolutskyi.task9.validation.validator;

import com.epam.tolstolutskyi.task9.validation.annotation.Pattern;

public class PatternValidator extends AbstractValidator {

	public boolean validate(Object value, Object annotationObject) {
		if (value == null) {
			return true;
		}
		
		Pattern annotation = (Pattern) annotationObject;
		return value.toString().matches(annotation.pattern());
	}

	public String getError(Object annotationObject) {
		Pattern annotation = (Pattern) annotationObject;
		return annotation.errorMessage();
	}

}
