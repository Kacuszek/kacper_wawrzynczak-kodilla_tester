package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(57, LocalDate.of(2021, 06, 02), "Kacper");
    Order order2 = new Order(123, LocalDate.of(2021, 06,15 ),"Krystian");
    Order order3 = new Order(215, LocalDate.of(2021, 05, 28),"Natalia");

    @Test
    public void shouldAddOrdersToShop() {
        //When
        int numberOfOrders = shop.orderNumber();
        //Then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldReturnListOfOrdersInDateRange() {
        //When
        Set<Order> orderSet = shop.getOrdersInDateRange(LocalDate.of(2021,05,27), LocalDate.of(2021, 06, 17));
        //Then
        assertEquals(3, orderSet.size());
    }

    @Test
    public void shouldReturnEmptyListOfOrdersWhenNotInDateRange() {
        //When
        Set<Order> orderSet = shop.getOrdersInDateRange(LocalDate.of(2021,05,01), LocalDate.of(2021, 05, 05));
        //Then
        assertEquals(0, orderSet.size());
    }

    @Test
    public void shouldGetOrdersInValueRange(){
        //When
        Set<Order> orderSet = shop.getMinAndMaxOrder(50, 130);
        //Then
        assertEquals(2, orderSet.size());
    }

    @Test
    public void shouldNotGetOrdersInValueRange(){
        //When
        Set<Order> orderSet = shop.getMinAndMaxOrder(0, 30);
        //Then
        assertEquals(0, orderSet.size());
    }

    @BeforeEach
    public void addOrderToShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting Values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing.");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing.");
    }

}