package com.aca.classroom.week6.lesson12;

public class ArrayBuffer implements Buffer {

    private String[] array = new String[1];

    @Override
    public void put(String value) {
        System.out.println("ArrayBuffer put");
        array[0] = value;
    }

    @Override
    public String get() {
        return array[0];
    }

    public static void main(String[] args) {
        ArrayBuffer buffer1 = new ArrayBuffer();
        ArrayBuffer buffer2 = new ArrayBuffer();
    }
}
