package com.aca.homework.week9.generic.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class ArrayListTest {

    @Test
    public void testWhenSizeIs0() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Assertions.assertEquals(0, stringArrayList.size());
    }

    @Test
    public void testGetSecondObject() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(24);
        integerArrayList.add(65);
        Assertions.assertEquals(65, integerArrayList.get(1));

    }

    @Test
    public void testArrayOutOfBounds() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                stringArrayList.get(1000);
            }
        });
    }

}