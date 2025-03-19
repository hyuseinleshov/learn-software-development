package com.hyuseinleshov.javaadvanced.designpatterns.dependencyinjection;

// Concrete implementation of MessageService
class EmailService implements MessageService {
    public String getMessage() {
        return "Email Sent Successfully!";
    }
}
