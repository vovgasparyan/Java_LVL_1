package com.aca.homework.week11.resolver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnglishHelloTranslaterTest {

    private EnglishHelloTranslater helloTranslater;

    @BeforeEach
    public void setUp() {
        helloTranslater = new EnglishHelloTranslater();
    }

    @Test
    public void testLanguageType() {
        Assertions.assertEquals(LanguageType.ENGLISH, helloTranslater.type());
    }

    @Test
    public void testHelloInEnglish() {
        Assertions.assertEquals("Hello", helloTranslater.hello());
    }
}