package com.example.Identity_service.model;

public class ErrorResponse {
    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "{\"message\": \"" + message + "\"}";
    }
}