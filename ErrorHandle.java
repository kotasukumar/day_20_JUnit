package com.company;

public class ErrorHandle extends Exception {
    public ErrorHandle(String invalid_input) {
        super(invalid_input);
    }
}
