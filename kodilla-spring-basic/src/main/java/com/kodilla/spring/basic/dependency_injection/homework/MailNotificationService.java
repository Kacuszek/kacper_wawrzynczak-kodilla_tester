package com.kodilla.spring.basic.dependency_injection.homework;

public class MailNotificationService implements NotificationService{
    @Override
    public void success(String address) {
        System.out.println("Sending mail: Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Sending mail: Package not delivered to: " + address);
    }
}
