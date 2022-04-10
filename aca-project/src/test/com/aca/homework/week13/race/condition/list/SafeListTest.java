package com.aca.homework.week13.race.condition.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SafeListTest {

    @Test
    public void testAddAndSize() {
        SafeList<Integer> list = new SafeList<>();
        list.add(10);
        Assertions.assertEquals(10, list.getObjectByIndex(0));
        Assertions.assertEquals(1, list.size());
    }
}