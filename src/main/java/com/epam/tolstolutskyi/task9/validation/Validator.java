package com.epam.tolstolutskyi.task9.validation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.epam.tolstolutskyi.task9.validation.annotation.ValidateBy;
import com.epam.tolstolutskyi.task9.validation.validator.AbstractValidator;

public class Validator {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 

	public static Map<String, String> validate(Object object) {
		try {
			Field[] fields = object.getClass().getDeclaredFields();
			Map<String, String> errors = new HashMap<>();
			for (Field field : fields) {
				field.setAccessible(true);
				Object fieldInstance;

				fieldInstance = field.get(object);

				Annotation[] annotations = field.getDeclaredAnnotations();
				for (Annotation annotation : annotations) {
					if (!annotation.annotationType().getName().equals("NotNull") && fieldInstance == null) {
						continue;
					}
					Class<?> fieldAnnotation = annotation.annotationType();
					AbstractValidator validator = fieldAnnotation.getAnnotation(ValidateBy.class).validateBy()
							.newInstance();
					if (!validator.validate(fieldInstance, annotation)) {
						errors.put(field.getName(), validator.getError(annotation));
					}
				}
			}
			return errors;
		} catch (IllegalArgumentException | IllegalAccessException | InstantiationException e) {
			LOGGER.severe(e.getMessage());
		}
		return new HashMap<String, String>();
	}

}
