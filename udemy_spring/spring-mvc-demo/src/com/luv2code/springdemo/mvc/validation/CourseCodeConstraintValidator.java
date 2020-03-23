package com.luv2code.springdemo.mvc.validation;

import java.util.stream.Stream;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] prefixCourseCode;
	
	
	
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		ConstraintValidator.super.initialize(theCourseCode);
		prefixCourseCode = theCourseCode.value();
	}




	@Override
	public boolean isValid(String code, ConstraintValidatorContext ctx) {
		
		if(code == null) return false;
		
		return Stream.of(prefixCourseCode).anyMatch(code::startsWith);

	}

}
