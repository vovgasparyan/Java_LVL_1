package com.aca.classroom.week12.lesson25.functional;

import java.util.function.Supplier;

public class IntegerSupplier implements Supplier<Integer> {

    @Override
    public Integer get() {
        // AUTO-BOXING
        return Integer.valueOf(8);
    }
}
