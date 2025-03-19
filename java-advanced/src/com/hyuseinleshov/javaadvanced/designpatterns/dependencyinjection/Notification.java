package com.hyuseinleshov.javaadvanced.designpatterns.dependencyinjection;

// Client class (Dependent on MessageService)
class Notification {
    private final MessageService messageService;

    // Constructor-based Dependency Injection
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification() {
        System.out.println(messageService.getMessage());
    }
}
