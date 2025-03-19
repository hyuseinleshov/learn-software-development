package com.hyuseinleshov.javaadvanced.designpatterns.dependencyinjection;

public class SetterBasedDIExample {
    public static void main(String[] args) {
        NotificationSetter notification = new NotificationSetter();

        // Injecting dependency using setter method
        notification.setMessageService(new EmailService());

        notification.sendNotification();
    }
}
