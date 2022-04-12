package com.company;

public class Email {
    public void checkEmail() {
        System.out.println("Checking validation for given mail id's");
        String regexEmailID = "^(abc)[.0-9+-]*(@)[0-9a-z]+(.com)+(.au)*$|^(abc)[0-9+-]*(@)[0-9a-z]+(.net)$";
        String[] email = new String[]{"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net"
                , "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        for (int i = 0; i < email.length; i++) {
            System.out.println(email[i].matches(regexEmailID));
        }
    }
}
