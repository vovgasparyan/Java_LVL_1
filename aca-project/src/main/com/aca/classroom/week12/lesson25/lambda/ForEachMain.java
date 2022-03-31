package com.aca.classroom.week12.lesson25.lambda;

import java.util.List;

public class ForEachMain {

    public static void main(String[] args) {
        List<String> list = List.of("String1", "String2");

/*
        for (final String s : list) {
            System.out.println(s);
        }
*/

/*        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        list.forEach(s -> System.out.println(s));

/*        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumer.accept("naxadasutyun");

        Consumer<String> consumer1 = s -> {
            System.out.println(s);
        };

        consumer1.accept("test");*/
    }
}
