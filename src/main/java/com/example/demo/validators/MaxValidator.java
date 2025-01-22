package com.example.demo.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MaxValidator  implements ConstraintValidator<ValidMaxEntry, Integer> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;
    @Override
    public void initialize(ValidMaxEntry constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext){
        if(context == null)return true;
        if(integer != null)myContext=context;
        if(integer < 0) return false;
        else return true;
    }
}