package com.aca.homework.week11.resolver;

public class RussianHelloTranslater implements HelloTranslater {

    @Override
    public String hello() {
        return "Привет";
    }

    @Override
    public LanguageType type() {
        return LanguageType.RUSSIAN;
    }
}
