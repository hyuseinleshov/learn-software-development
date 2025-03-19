package com.hyuseinleshov.javaadvanced.designpatterns.dependencyinjection;

class NotificationSetter {
    private MessageService messageService;

    // Setter-based Dependency Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification() {
        if (messageService != null) {
            System.out.println(messageService.getMessage());
        } else {
            System.out.println("No Message Service available!");
        }
    }
}
