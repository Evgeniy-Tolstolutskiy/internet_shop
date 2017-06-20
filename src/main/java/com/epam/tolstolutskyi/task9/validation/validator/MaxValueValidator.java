package com.epam.tolstolutskyi.task9.validation.validator;

import com.epam.tolstolutskyi.task9.validation.annotation.MaxValueValidation;

public class MaxValueValidator extends AbstractValidator {

	public boolean validate(Object value, Object annotationObject) {
		if (value == null) {
			return true;
		}

		Integer intObj = Integer.valueOf(value.toString());
		MaxValueValidation annotation = (MaxValueValidation) annotationObject;
		if (intObj <= annotation.value()) {
			return true;
		}
		return false;
	}

	public String getError(Object annotationObject) {
		MaxValueValidation annotation = (MaxValueValidation) annotationObject;
		return annotation.errorMessage();
	}

}
