package com.aca.exam.exam2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileSourceUserRepositoryTest {

    private FileSourceUserRepository userRepository;

    @BeforeEach
    public void setUp() {
        userRepository = new FileSourceUserRepository();
    }

    @Test
    public void testGetInstance() {
        User user = userRepository.findById("lardbear");
        Assertions.assertNotNull(user);
    }

    @Test
    public void testFindByIdWhenIdIsNotFound() {
        User user = userRepository.findById("vovani");
        Assertions.assertNull(user);
    }


    @Test
    public void testFindByIdWhenIdIsFound() {
        User user = userRepository.findById("barracudaassign");
        Assertions.assertEquals("barracudaassign", user.getId());
    }

    @Test
    public void testFindAll() {
        List<User> users = userRepository.findAll();
        Assertions.assertEquals("Baca", users.get(0).getLastName());
    }

}