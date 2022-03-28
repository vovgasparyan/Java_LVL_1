package com.aca.homework.week10.entry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntryImplTest {

    Entry<String, Integer> entry;

    @BeforeEach
    public void setUp() {
        entry = new EntryImpl<>("Vladimir", 40);
    }

    @Test
    public void testKey() {
        Assertions.assertEquals("Vladimir", entry.key());
    }

    @Test
    public void testValue() {
        Assertions.assertEquals(40, entry.value());
    }
}