package com.aca.homework.week6.buffer;

public class BufferImpl implements Buffer {

    private Object object;

    @Override
    public void put(Object obj) {
        if (this.object != null) {
            System.out.println("The buffer is not empty");
            return;
        }
        this.object = obj;
    }

    @Override
    public Object get() {
        if (this.object == null) {
            System.out.println("Buffer is empty");
            return null;
        }
        Object temp = this.object;
        this.object = null;
        return temp;
    }

    @Override
    public String toString() {
        return "Buffer object is: " + this.object;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
