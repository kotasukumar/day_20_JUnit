package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name(first letter should be capital)");
        String firstName = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        System.out.println(firstName.matches(regex));

        System.out.println("Enter the last name(first letter should be capital)");
        String lastName = scanner.next();
        String regexLastName = "^[A-Z]{1}[a-z]{3,}$";
        System.out.println(lastName.matches(regexLastName));

        System.out.println("Enter a valid email id(eg: abc.xyz@bl.co.in)");
        String emailID = scanner.next();
        String regexEmailID = "^(abc)[.0-9+-]*(@)[0-9a-z]+(.com)+(.au)*$|^(abc)[0-9+-]*(@)[0-9a-z]+(.net)$";
        System.out.println(emailID.matches(regexEmailID));

        System.out.println("Enter a valid mobile number");
        String regexMobileNumber = "^91[ ][\\d]{10}$";
        System.out.println("91 1111111111".matches(regexMobileNumber));

        System.out.println("Enter a password");
        String password = scanner.next();
        String regexPassword = "^(?=.*[0-9])(?=.*[A-Z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$).{8,}$";
        System.out.println(password.matches(regexPassword));*/

        Email email = new Email();
        email.checkEmail();
    }
}
