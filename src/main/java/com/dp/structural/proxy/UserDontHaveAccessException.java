package com.dp.structural.proxy;

public class UserDontHaveAccessException extends RuntimeException {
    public UserDontHaveAccessException(String message) {
        super(message);
    }

}
