package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTestSuite {
    @Test
    public void testDoesOrderExist() {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        warehouse.addOrder( new Order("58"));
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("45"));
    }
}