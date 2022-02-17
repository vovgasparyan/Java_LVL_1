package com.aca.classroom.week6.lesson13.set;

public abstract class AbstractSet implements Set {

    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
