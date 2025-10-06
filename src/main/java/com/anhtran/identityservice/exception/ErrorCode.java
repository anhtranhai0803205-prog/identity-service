package com.anhtran.identityservice.exception;


import lombok.Getter;

@Getter
public enum ErrorCode {
    USER_EXSITED (1002, "User is existed"),
    UNCATEGORIED_EXCEPTION (9999, "Uncategorized"),
    USERNAME_INVALID(1003, "Username must be at least 3 chracters"),
    INVALID_PASSWORD(1004, "Password must be at least 8 characters"),
    INVALID_KEY(1001, "Invalid message key");

    ErrorCode(int code, String message) {
        this.message = message;
        this.code = code;
    }

    private int code;
    private String message;


}
