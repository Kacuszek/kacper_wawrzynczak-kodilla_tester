package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("96"));

        try {
            warehouse.getOrder("3");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist.");
        }

    }
}
