package com.aca.homework.week21.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class OptionalMainTest {

    private OptionalMain optional;

    @BeforeEach
    public void init() {
        optional = new OptionalMain();
    }

    @Test
    public void testWhenOptionalIsEmpty() {
        optional.printFirstSymbol(Optional.empty());
        Assertions.assertEquals(0, optional.getSize());
    }

    @Test
    public void testWhenStringIsEmpty() {
        optional.printFirstSymbol(Optional.of(""));
        Assertions.assertEquals(0, optional.getSize());
    }

    @Test
    public void testWhenStringHas1Symbol() {
        optional.printFirstSymbol(Optional.of("c"));
        Assertions.assertEquals(0, optional.getSize());
    }

    @Test
    public void testWhenStringHas2Symbols() {
        optional.printFirstSymbol(Optional.of("ab"));
        Assertions.assertEquals(1, optional.getSize());
    }

}