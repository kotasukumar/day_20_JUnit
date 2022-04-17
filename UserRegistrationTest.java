package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest extends Exception {
        UserRegistration userRegistration = new UserRegistration();

    @Test
    void givenFirstName_WhenValid_ReturnTrue() throws ErrorHandle {
        boolean result = userRegistration.firstNameValidation("Sukumar");
        if (result == true){
            System.out.println("Valid input please proceed");
        }
        else {
            throw new ErrorHandle("Invalid Input please enter a valid input");
        }
    }

    @Test
    void givenFirstName_WhenNotProper_ReturnFalse() throws ErrorHandle {
        boolean result = userRegistration.firstNameValidation("su");
        if (result == true){
            System.out.println("Valid input please proceed");
        }
        else {
            throw new ErrorHandle("Invalid Input please enter a valid input");
        }
    }

    @Test
    void givenLastName_WhenProper_ReturnTrue() throws ErrorHandle {
        boolean result = userRegistration.lastNameValidation("Kota");
        if (result == true){
            System.out.println("Valid input proceed");;
        }
        else {
            throw new ErrorHandle("Invalid Input please enter a valid input");
        }
    }

    @Test
    void givenName_WhenNotProper_ReturnFalse() throws ErrorHandle {
        boolean result = userRegistration.lastNameValidation("ko");
        if (result == true){
            System.out.println("Valid input proceed");;
        }
        else {
            throw new ErrorHandle("Invalid Input please enter a valid input");
        }
    }

    @Test
    void givenEmail_WhenProper_ReturnTrue() throws ErrorHandle {
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        if (result == true){
            System.out.println("Valid input proceed");;
        }
        else {
            throw new ErrorHandle("Invalid Input please enter a valid input");
        }
    }

    @Test
    void givenEmail_WhenNotProper_ReturnFalse() throws ErrorHandle {
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        if (result == true){
            System.out.println("Valid input proceed");;
        }
        else {
            throw new ErrorHandle("Invalid Input please enter a valid input");
        }
    }

    @Test
    void givenMobileNumber_WhenProper_ReturnTrue() throws ErrorHandle {
        boolean result = userRegistration.mobileNumber("91 1111111111");
        if (result == true){
            System.out.println("Valid input proceed");;
        }
        else {
            throw new ErrorHandle("Invalid Input please enter a valid input");
        }
    }

    @Test
    void givenMobileNumber_WhenNotProper_ReturnFalse() throws ErrorHandle {
        boolean result = userRegistration.mobileNumber("91 1111111");
        if (result == true){
            System.out.println("Valid input proceed");;
        }
        else {
            throw new ErrorHandle("Invalid Input please enter a valid input");
        }
    }

    @Test
    void givenPassword_WhenProper_ReturnTrue() throws ErrorHandle {
        boolean result = userRegistration.password("Suku@123");
        if (result == true){
            System.out.println("Valid input proceed");;
        }
        else {
            throw new ErrorHandle("Invalid Input please enter a valid input");
        }
    }

    @Test
    void givenPassword_WhenNotProper_ReturnFalse() throws ErrorHandle {
        boolean result = userRegistration.password("Suk123");
        if (result == true){
            System.out.println("Valid input proceed");;
        }
        else {
            throw new ErrorHandle("Invalid Input please enter a valid input");
        }
    }
}