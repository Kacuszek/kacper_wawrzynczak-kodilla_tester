package com.kodilla.spring.basic.dependency_injection.homework;

public class TextNotificationService implements NotificationService{
    @Override
    public void success(String address) {
        System.out.println("Sending text: Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Sending text: Package not delivered to: " + address);
    }
}
