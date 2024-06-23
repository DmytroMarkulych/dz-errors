package org.example.exceptions;

public class WrongCurrencyException extends Exception {
    public WrongCurrencyException() {
        super("Wrong currency");
    }
}
