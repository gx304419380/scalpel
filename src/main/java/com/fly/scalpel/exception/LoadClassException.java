package com.fly.scalpel.exception;

/**
 * @author guoxiang
 * @version 1.0.0
 * @since 2021/2/1
 */
public class LoadClassException extends RuntimeException {
    public LoadClassException() {
    }

    public LoadClassException(String message) {
        super(message);
    }
}
