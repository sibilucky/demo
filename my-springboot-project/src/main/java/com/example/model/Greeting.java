package com.example.model;

public class Greeting {

    private String message;

    // Default constructor
    public Greeting() {
    }

    // Constructor with message
    public Greeting(String message) {
        this.message = message;
    }

    // Getter and Setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
