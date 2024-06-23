package org.example.exceptions;

public class WrongAccountException extends Exception {
    public WrongAccountException() {
        super("Account does not exist");
    }
}