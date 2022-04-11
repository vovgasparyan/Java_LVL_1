package com.aca.homework.week11.resolver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RussianHelloTranslaterTest {

    private RussianHelloTranslater helloTranslater;

    @BeforeEach
    public void setUp() {
        helloTranslater = new RussianHelloTranslater();
    }

    @Test
    public void testLanguageType() {
        Assertions.assertEquals(LanguageType.RUSSIAN, helloTranslater.type());
    }

    @Test
    public void testHelloInRussian() {
        Assertions.assertEquals("Привет", helloTranslater.hello());
    }
}