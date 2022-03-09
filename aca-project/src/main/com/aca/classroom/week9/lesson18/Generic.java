package com.aca.classroom.week9.lesson18;

public class Generic<T1,T2> {

    public void set1(Integer t) {

    }

    public void set1(T1 t) {

    }

    public void set2(T2 t) {

    }

    public static <E> E identity(E input) {
        return input;
    }

    public static void main(String[] args) {
        Generic<Integer, String> generic1 = new Generic<>();
        Generic<Boolean, Short> generic2 = new Generic<>();
    }
}
