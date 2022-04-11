package com.aca.homework.week9.tuple2;

public class Tuple2<T1, T2> {

    private T1 obj1;
    private T2 obj2;

    public Tuple2(T1 object1, T2 object2) {
        this.obj1 = object1;
        this.obj2 = object2;
    }

    public T1 getT1() {
        return obj1;
    }

    public T2 getT2() {
        return obj2;
    }
}
