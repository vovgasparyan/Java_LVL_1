package com.aca.homework.week6.buffer;

public class Main {

    public static void main(String[] args) {

        BufferImpl buffer1 = new BufferImpl();
        buffer1.get();
        buffer1.put("Simple text");
        buffer1.put("Loren ipsum");
        System.out.println(buffer1.get());
        System.out.println(buffer1);

    }
}
