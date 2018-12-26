package com.DemoMaven.multimodule.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.DemoMaven.multimodule.UserBackingBean;

/**
 * @author alemolin
 *
 */
public class PasswordsEqualConstraintValidator implements ConstraintValidator<PasswordsEqualConstraint, Object> {
	@Override
	public void initialize(PasswordsEqualConstraint arg0){
		
	}
	
	@Override
	public boolean isValid(Object candidate, ConstraintValidatorContext arg1) {
		UserBackingBean user = (UserBackingBean) candidate;
		return user.getPassword().equals(user.getConfirmPassword());
	}
}