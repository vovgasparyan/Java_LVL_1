package com.aca.homework.week8.car.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CarTest {

    @Test
    public void testWhenReferenceIsSame() {
        Car car1 = new Car("ATR012VBA05", 2019, 1);
        Assertions.assertEquals(car1, car1);
    }

    @Test
    public void testWhenCarsHaveSameFieldValues() {
        Car car1 = new Car("ATR012VBA05", 2019, 1);
        Car car2 = new Car("ATR012VBA05", 2019, 1);
        assertNotEquals(car1, car2);
    }

    @Test
    public void testCarEqualString() {
        String str = "some text";
        Car car1 = new Car("ATR012VBA05", 2019, 1);
        assertNotEquals(car1, str);
    }

}