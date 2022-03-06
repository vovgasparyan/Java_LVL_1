package com.aca.homework.week9.tuple2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Tuple2Test {


    @Test
    public void testStringInteger () {
        Tuple2<String, Integer> tuple2 = new Tuple2<>("text", 45);
        Assertions.assertEquals(tuple2.getT1(), "text");
        Assertions.assertEquals(tuple2.getT2(), 45);
    }

    @Test
    public void testLongInteger() {
        Tuple2<Long, Integer> tuple2 = new Tuple2<>(100L, 45);
        Assertions.assertEquals(tuple2.getT1(), 100);
        Assertions.assertEquals(tuple2.getT2(), 45);
    }
}