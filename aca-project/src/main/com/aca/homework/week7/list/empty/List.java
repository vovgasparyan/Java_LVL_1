package com.aca.homework.week7.list.empty;

public interface List {

    int size();

    void add(Object o);

    boolean isEmpty();

    Object get(int index);

    static List ofFixedSize() {
        return new FixedSizeList();
    }

    static List ofEmpty() {
        return new List() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public void add(Object o) {
                System.out.println("List is empty from anonymous");
            }

            @Override
            public boolean isEmpty() {
                return true;
            }

            @Override
            public Object get(int index) {
                return null;
            }
        };
    }
}
