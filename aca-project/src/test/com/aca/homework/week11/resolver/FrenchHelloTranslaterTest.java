package com.aca.homework.week11.resolver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrenchHelloTranslaterTest {

    private FrenchHelloTranslater helloTranslater;

    @BeforeEach
    public void setUp() {
        helloTranslater = new FrenchHelloTranslater();
    }

    @Test
    public void testLanguageType() {
        Assertions.assertEquals(LanguageType.FRENCH, helloTranslater.type());
    }

    @Test
    public void testHelloInFrench() {
        Assertions.assertEquals("Salut", helloTranslater.hello());
    }
}