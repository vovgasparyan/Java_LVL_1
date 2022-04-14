package com.aca.homework.week14.shared.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SharedListMainTest {

    @Test
    public void testRunnable() {
        SharedListMain listMain = new SharedListMain();
        Assertions.assertEquals(1000, listMain.execute());
    }
}