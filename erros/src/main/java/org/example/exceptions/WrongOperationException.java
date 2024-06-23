package org.example.exceptions;

public class WrongOperationException extends Exception {
    public WrongOperationException() {
        super("Insufficient funds");
    }
}