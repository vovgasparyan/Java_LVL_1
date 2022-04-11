package com.aca.homework.week11.resolver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class HelloTranslaterResolverTest {

    private HelloTranslaterResolver resolver;

    @BeforeEach
    public void setUp() {
        resolver = new HelloTranslaterResolver(List.of(new RussianHelloTranslater(), new FrenchHelloTranslater(), new EnglishHelloTranslater()));
    }

    @Test
    public void testResolveWithHelloMethodWhenLanguageIsEnglish() {
        Assertions.assertEquals("Hello", resolver.resolve(LanguageType.ENGLISH).hello());
    }

    @Test
    public void testResolveWithHelloMethodWhenLanguageIsFrench() {
        Assertions.assertEquals("Salut", resolver.resolve(LanguageType.FRENCH).hello());
    }

    @Test
    public void testResolveWithHelloMethodWhenLanguageIsRussian() {
        Assertions.assertEquals("Привет", resolver.resolve(LanguageType.RUSSIAN).hello());
    }

}