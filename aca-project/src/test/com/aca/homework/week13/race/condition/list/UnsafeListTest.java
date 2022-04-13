package com.aca.homework.week13.race.condition.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnsafeListTest {

    @Test
    public void testAddAndSize() {
        UnsafeList<Integer> list = new UnsafeList<>();
        list.add(10);
        Assertions.assertEquals(10, list.getObjectByIndex(0));
        Assertions.assertEquals(1, list.size());
    }
}