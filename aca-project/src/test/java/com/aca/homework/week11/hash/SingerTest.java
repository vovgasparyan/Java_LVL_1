package com.aca.homework.week11.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingerTest {

    @Test
    public void test2EqualObjectsHaveSameHashCodes() {
        Singer singer1 = new Singer("Celine", "Dion");
        Singer singer2 = new Singer("Celine", "Dion");
        Assertions.assertEquals(singer1, singer2);
        Assertions.assertEquals(singer1.hashCode(), singer2.hashCode());
    }

    @Test
    public void test2DiffObjectsHaveDiffHashCodes() {
        Singer singer1 = new Singer("Celine", "Dion");
        Singer singer2 = new Singer("Steve", "Wonder");
        Assertions.assertNotEquals(singer1, singer2);
        Assertions.assertNotEquals(singer1.hashCode(), singer2.hashCode());
    }

}