package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public Set<Order> getOrdersInDateRange(LocalDate fromDate, LocalDate toDate) {
        return orders.stream()
                .filter(u -> u.getOrderDate().isAfter(fromDate) && u.getOrderDate().isBefore(toDate))
                .collect(Collectors.toSet());
    }


    public Set<Order> getMinAndMaxOrder(double minOrderValue, double maxOrderValue) {
        Set<Order> ordersMinAndMaxRange = orders.stream()
                .filter(u -> u.getOrderValue() >= minOrderValue && u.getOrderValue() <= maxOrderValue)
                .collect(Collectors.toSet());
        return ordersMinAndMaxRange;
    }

    public int orderNumber() {
        return orders.size();
    }

    public double orderValue() {
        double orderValue = orders.stream()
                .map(u -> u.getOrderValue())
                .mapToDouble(u -> u)
                .sum();
        return orderValue;
    }


}
