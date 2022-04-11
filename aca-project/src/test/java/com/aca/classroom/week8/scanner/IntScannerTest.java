package com.aca.classroom.week8.scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntScannerTest {

    private IntScanner testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = new IntScanner(new IntSupplierForTest());
    }

    @Test
    public void testGet5SizedArray() {
        int[] array = testSubject.get5SizedArray();
        Assertions.assertEquals(9,array[0]);
        Assertions.assertEquals(9,array[1]);
        Assertions.assertEquals(4,array[2]);
        Assertions.assertEquals(5,array[3]);
        Assertions.assertEquals(6,array[4]);

    }

}