package com.aca.homework.week3.license.covid.test;

public class CovidTest {

    private User user;
    private String result = "undefined";

    public String test() {
        long start = System.currentTimeMillis();
        while ((System.currentTimeMillis() - start) < 3000) {
        }

        int index = (int) (Math.random() * 3);
        if (index == 1) {
            this.result = "positive";
        } else if (index == 2) {
            this.result = "negative";
        }

        return this.result;
    }

}
