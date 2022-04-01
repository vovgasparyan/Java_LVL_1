package com.aca.homework.week8.car.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarRepositoryTest {

    private CarRepository testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = new CarRepository();
    }

    @Test
    public void testSave() {
        Car car1 = new Car("DBX2003", 2018, 1);
        testSubject.save(car1);
        Assertions.assertEquals(1, testSubject.getTotalCount());
    }

    @Test
    public void testSaveSameCar2Times() {
        Car car1 = new Car("DBX2003", 2018, 1);
        Car car2 = new Car("DBX2003", 2018, 1);
        testSubject.save(car1);
        testSubject.save(car2);
        Assertions.assertEquals(1, testSubject.getTotalCount());
    }

    @Test
    public void testSave2DifferentCars() {
        Car car1 = new Car("DBX2003", 2018, 1);
        Car car2 = new Car("SVO04T6", 2019, 2);
        testSubject.save(car1);
        testSubject.save(car2);
        Assertions.assertEquals(2, testSubject.getTotalCount());
    }

    @Test
    public void testSave2DifferentCarsTwice() {
        Car car1 = new Car("DBX2003", 2018, 1);
        Car car2 = new Car("SVO04T6", 2019, 2);
        testSubject.save(car1);
        testSubject.save(car1);
        testSubject.save(car2);
        testSubject.save(car2);
        Assertions.assertEquals(2, testSubject.getTotalCount());
    }

    @Test
    public void testFindByVinWhenTotalCountIs0() {
        Assertions.assertEquals(0, testSubject.getTotalCount());
    }

    @Test
    public void testFindByVinWhenCarExists() {
        Car car1 = new Car("DBX2003", 2018, 1);
        String str = "DBX2003";
        testSubject.save(car1);
        Assertions.assertEquals(str, testSubject.findByVin(str).getVin());
    }

    @Test
    public void testGetTotalCountWhenThereIsNoSavedCar() {
        Assertions.assertEquals(0, testSubject.getTotalCount());
    }

}