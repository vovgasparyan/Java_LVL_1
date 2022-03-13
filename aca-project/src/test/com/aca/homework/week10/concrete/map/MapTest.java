package com.aca.homework.week10.concrete.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MapTest {

    private Map testMap;

    @BeforeEach
    public void setUp() {
        testMap = new Map();
    }

    @Test
    public void testPutWhenKeyIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                testMap.put(null, "test 1");
            }
        });
    }

    @Test
    public void testPutWhenValueIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                testMap.put("key1", null);
            }
        });
    }

    @Test
    public void testGetValueWhenValueIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                testMap.getValue(null);
            }
        });
    }

    @Test
    public void testGetValueWhenKeyIsNotFound() {
        Assertions.assertNull(testMap.getValue("secretKey"));
    }

    @Test
    public void testGetValueWhenKeyIsFound() {
        testMap.put("key1", "value1");
        Assertions.assertEquals("value1", testMap.getValue("key1"));
    }

    @Test
    public void testSizeWhenEmpty() {
        Assertions.assertEquals(0, testMap.size());
    }

    @Test
    public void testSizeWhen1PairIsAdded() {
        testMap.put("key1", "value1");
        Assertions.assertEquals(1, testMap.size());
    }
}