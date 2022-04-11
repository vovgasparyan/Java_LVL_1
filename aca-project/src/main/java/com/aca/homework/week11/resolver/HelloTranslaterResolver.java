package com.aca.homework.week11.resolver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloTranslaterResolver {

    Map<LanguageType, HelloTranslater> map = new HashMap<>();

    public HelloTranslaterResolver(List<HelloTranslater> list) {
        for (HelloTranslater helloTranslater : list) {
            this.map.put(helloTranslater.type(), helloTranslater);
        }
    }

    public HelloTranslater resolve(LanguageType languageType) {
        return this.map.get(languageType);
    }
}
