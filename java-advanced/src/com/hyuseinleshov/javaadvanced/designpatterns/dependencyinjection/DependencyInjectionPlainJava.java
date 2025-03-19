package com.hyuseinleshov.javaadvanced.designpatterns.dependencyinjection;

// Main class to demonstrate Dependency Injection
public class DependencyInjectionPlainJava {
    public static void main(String[] args) {
        // Manually injecting the dependency
        MessageService emailService = new EmailService(); // Dependency
        Notification notification = new Notification(emailService); // Injecting the dependency

        notification.sendNotification();
    }
}
