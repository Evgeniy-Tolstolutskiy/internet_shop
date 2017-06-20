package com.epam.tolstolutskyi.task9.validation.validator;

import com.epam.tolstolutskyi.task9.validation.annotation.MinValueValidation;

public class MinValueValidator extends AbstractValidator {

	public boolean validate(Object value, Object annotationObject) {
		if (value == null) {
			return true;
		}
		
		Integer intObj = Integer.valueOf(value.toString());
		MinValueValidation annotation = (MinValueValidation)annotationObject;
		if(intObj >= annotation.value()){
			return true;
		}
		return false;
	}

	public String getError(Object annotationObject) {
		MinValueValidation annotation = (MinValueValidation)annotationObject;
		return annotation.errorMessage();
	}

}
