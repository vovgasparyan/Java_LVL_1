package com.aca.homework.week13.race.condition.list;

public class UnsafeList<E> implements List<E> {

    private Object[] objects = new Object[10_000];
    private int index;

    @Override
    public void add(E item) {
        objects[index++] = item;
    }

    @Override
    public int size() {
        return index;
    }

    public Object getObjectByIndex(int index) {
        Object o = null;
        for (int i = 0; i < this.objects.length; i++) {
            if (index == i) {
                o = this.objects[index];
                break;
            }
        }
        return o;
    }
}
