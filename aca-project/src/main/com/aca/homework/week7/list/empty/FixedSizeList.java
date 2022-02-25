package com.aca.homework.week7.list.empty;

public class FixedSizeList implements List {

    private Object[] objects = new Object[10];
    private int elem;

    @Override
    public int size() {
        return elem;
    }

    @Override
    public void add(Object o) {
        if (elem == objects.length) {
            System.out.println("The list is full");
            return;
        }
        objects[elem] = o;
        elem++;
    }

    @Override
    public boolean isEmpty() {
        return elem == 0;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= this.elem) {
            return -1;
        }
        return objects[index];
    }
}
