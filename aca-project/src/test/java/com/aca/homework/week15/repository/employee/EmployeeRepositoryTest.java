package com.aca.homework.week15.repository.employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeRepositoryTest {

    CrudRepository<Employee, String> testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = new EmployeeRepository(new ConnectionFactory());
    }

    @Test
    public void testSave() {
        testSubject.save(new Employee("spider", "Mike", "Lawry", 10000L));
        testSubject.save(new Employee("labrador", "Alex", "Smith", 15000L));
        Employee employee = testSubject.findById("spider");
        Assertions.assertEquals("spider", employee.getId());
    }

    @Test
    public void testFindByAll() {
        Assertions.assertNotNull(testSubject.findAll());
    }

    @Test
    public void testFindById() {
        Employee employee = testSubject.findById("spider");
        Assertions.assertEquals("spider", employee.getId());
    }

    @Test
    public void testDeleteAll() {
        testSubject.deleteAll();
        Assertions.assertEquals(0, testSubject.findAll().size());
    }

}