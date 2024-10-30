package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;

@Constraint(validatedBy = CourseCodeContraintValidator.class) // this is the validation constaint
@Target({ ElementType.METHOD, ElementType.FIELD }) // where the annotation will be applying
public @interface CourseCode {

}
