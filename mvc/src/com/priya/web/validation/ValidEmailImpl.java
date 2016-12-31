package com.priya.web.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.validator.routines.EmailValidator;

public class ValidEmailImpl implements ConstraintValidator<ValidEmail, String> {

	private int min;

	@Override
	public void initialize(ValidEmail constraintAnnotation) {
		min = constraintAnnotation.min();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value.length() < min) {
			return false;
		}
		if (!EmailValidator.getInstance(false).isValid(value)) {
			return false;
		}

		return true;
	}

}
