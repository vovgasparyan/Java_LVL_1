package com.aca.classroom.week13.lesson27.buffer;

public interface Buffer<T> {

    T get() throws InterruptedException;

    void put(T t) throws InterruptedException;
}
