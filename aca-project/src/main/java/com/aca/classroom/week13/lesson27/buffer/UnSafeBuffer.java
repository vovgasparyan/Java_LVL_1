package com.aca.classroom.week13.lesson27.buffer;

public final class UnSafeBuffer<T> implements Buffer<T> {

    private T value;

    @Override
    public T get() {
        if (value == null) {
            throw new IllegalStateException("The buffer is empty");
        }
        T valueToReturn = value;
        value = null;
        return valueToReturn;
    }

    @Override
    public void put(T t) throws InterruptedException {
        if (t == null) {
            throw new IllegalArgumentException("The provided value is null");
        }
        if (value != null) {
            throw new IllegalStateException("The buffer is full");
        }
        this.value = t;
    }
}
