package com.company;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL = "^(abc)[.0-9+-]*(@)[0-9a-z]+(.com)+(.au)*$|^(abc)[0-9+-]*(@)[0-9a-z]+(.net)$";
    private static final String MOBILENUMBER = "^91[ ][\\d]{10}$";
    private static final String PASSWORD = "^(?=.*[0-9])(?=.*[A-Z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$).{8,}$";

    public boolean firstNameValidation(String firstName){
        boolean result = firstName.matches(NAME);
            return result;
    }

    public boolean lastNameValidation(String firstName){
        boolean result = firstName.matches(NAME);
        return  result;
    }

    public boolean emailValidation(String email){
        boolean result = email.matches(EMAIL);
        return  result;
    }

    public boolean mobileNumber(String number){
        boolean result = number.matches(MOBILENUMBER);
        return  result;
    }

    public boolean password(String password){
        boolean result = password.matches(PASSWORD);
        return  result;
    }
}
