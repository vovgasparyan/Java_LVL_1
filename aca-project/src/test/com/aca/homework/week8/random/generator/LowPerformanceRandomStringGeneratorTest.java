package com.aca.homework.week8.random.generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LowPerformanceRandomStringGeneratorTest {

    private LowPerformanceRandomStringGenerator stringGenerator;

    @BeforeEach
    public void setUp() {
        stringGenerator = new LowPerformanceRandomStringGenerator();
    }

    @Test
    public void testWrongNumber() {
        Result result = stringGenerator.randomString(7);
        Assertions.assertEquals("error", result.getText());
        Assertions.assertEquals(0, result.getDuration());
    }

    @Test
    public void test30000() {
        Result result = stringGenerator.randomString(30000);
        Assertions.assertTrue(result.getDuration() > 0);
        Assertions.assertEquals(30000, result.getText().length() / 3);
        System.out.println("LowPerformanceRandomStringGenerator working in: " + result.getDuration() + " time");
    }
}