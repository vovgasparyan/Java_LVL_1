package com.aca.exam.exam2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileSourceOrderRepositoryTest {

    private FileSourceOrderRepository orderRepository;

    @BeforeEach
    public void setUp() {
        orderRepository = new FileSourceOrderRepository(FileSourceUserRepository.create());
    }

    @Test
    public void testFindByIdWhenIdIsNotFound() {
        Assertions.assertNull(orderRepository.findById(15));
    }

    @Test
    public void testFindByIdWhenIdIsFound() {
        Assertions.assertNotNull(orderRepository.findById(5));
    }

    @Test
    public void testFindAllSize() {
        Assertions.assertEquals(9, orderRepository.findAll().size());
    }

    @Test
    public void testFindAllByUserId() {
        Assertions.assertEquals(3, orderRepository.findAllByUserId("shawlinspire").size());
    }

}