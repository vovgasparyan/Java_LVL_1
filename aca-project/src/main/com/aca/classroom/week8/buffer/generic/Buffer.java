package com.aca.classroom.week8.buffer.generic;

public interface Buffer<T> {

    void put(T o);
    T get();

}
