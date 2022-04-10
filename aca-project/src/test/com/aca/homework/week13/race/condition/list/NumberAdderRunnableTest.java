package com.aca.homework.week13.race.condition.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberAdderRunnableTest {

    @Test
    public void testNumberAdderRunnable() {
        List<Integer> list = new SafeList<>();
        NumberAdderRunnable runnable = new NumberAdderRunnable(list, 10);
        runnable.run();
        Assertions.assertEquals(1, list.size());
    }
}