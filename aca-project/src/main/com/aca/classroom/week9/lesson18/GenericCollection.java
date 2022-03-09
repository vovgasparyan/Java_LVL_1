package com.aca.classroom.week9.lesson18;

public class GenericCollection<E> {

    private static int ARRAY_SIZE = 100;

    private Object[] objects = new Object[ARRAY_SIZE];

    public void set(int index, E element) {
        objects[index] = element;
    }

    public E get(int index) {
        return (E) objects[index];
    }

    public static void main(String[] args) {
        GenericCollection<Integer> collection1 = new GenericCollection<>();
        collection1.set(1, 45);

        Integer integer = collection1.get(1);

    }
}
