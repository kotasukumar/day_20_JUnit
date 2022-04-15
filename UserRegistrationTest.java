package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
        UserRegistration userRegistration = new UserRegistration();

    @Test
    void givenFirstName_WhenValid_ReturnTrue() {
        boolean result = userRegistration.firstNameValidation("Sukumar");
        Assert.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNotProper_ReturnFalse() {
        boolean result = userRegistration.firstNameValidation("su");
        Assert.assertFalse(result);
    }

    @Test
    void givenLastName_WhenProper_ReturnTrue() {
        boolean result = userRegistration.lastNameValidation("Kota");
        Assert.assertTrue(result);
    }

    @Test
    void givenName_WhenNotProper_ReturnFalse() {
        boolean result = userRegistration.lastNameValidation("ko");
        Assert.assertFalse(result);
    }

    @Test
    void givenEmail_WhenProper_ReturnTrue() {
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    void givenEmail_WhenNotProper_ReturnFalse() {
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        Assert.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenProper_ReturnTrue() {
        boolean result = userRegistration.mobileNumber("91 1111111111");
        Assert.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenNotProper_ReturnFalse() {
        boolean result = userRegistration.mobileNumber("91 1111111");
        Assert.assertFalse(result);
    }

    @Test
    void givenPassword_WhenProper_ReturnTrue() {
        boolean result = userRegistration.password("Suku@123");
        Assert.assertTrue(result);
    }

    @Test
    void givenPassword_WhenNotProper_ReturnFalse() {
        boolean result = userRegistration.password("Suk123");
        Assert.assertFalse(result);
    }
}