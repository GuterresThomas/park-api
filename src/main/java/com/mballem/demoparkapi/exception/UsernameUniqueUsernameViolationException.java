package com.mballem.demoparkapi.exception;

public class UsernameUniqueUsernameViolationException extends RuntimeException {
    public UsernameUniqueUsernameViolationException(String message) {
        super(message);
    }
}
