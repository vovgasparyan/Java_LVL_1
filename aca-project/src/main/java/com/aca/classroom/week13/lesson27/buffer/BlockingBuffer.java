package com.aca.classroom.week13.lesson27.buffer;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer<T> implements Buffer<T> {

    private final ArrayBlockingQueue<T> queue = new ArrayBlockingQueue<>(1);

    @Override
    public T get() throws InterruptedException {
        return queue.take();
    }

    @Override
    public void put(T t) throws InterruptedException {
        queue.put(t);
    }
}
