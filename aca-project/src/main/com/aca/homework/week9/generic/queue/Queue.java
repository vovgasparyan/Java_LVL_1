package com.aca.homework.week9.generic.queue;

public class Queue<T> {

    private Object[] objects = new Object[10000];
    private int produceIndex;
    private int index;

    public void produce(T object) {
        if (object == null) {
            throw new IllegalArgumentException("The null argument is given.");
        }
        objects[produceIndex++] = object;
    }

    public T consume() {
        if (produceIndex == index) {
            throw new QueueEmptyException();
        }
        T newObject = (T) objects[index];
        index++;
        return newObject;
    }

    public int differenceOfElements() {
        return produceIndex - index;
    }
}
