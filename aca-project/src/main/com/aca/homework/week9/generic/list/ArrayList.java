package com.aca.homework.week9.generic.list;

public class ArrayList<T> implements List<T> {

    private Object[] objects = new Object[1000];
    private static int index;

    @Override
    public void add(T object) {
        objects[index++] = object;
    }

    @Override
    public T get(int index) {
        if (index > objects.length || index < 0)
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        return (T) objects[index];
    }

    @Override
    public int size() {
        return index;
    }
}
