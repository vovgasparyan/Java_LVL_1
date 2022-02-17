package com.aca.classroom.week6.lesson12;

public class BufferTest {

    public static void main(String[] args) {

        Buffer buffer = new MyBuffer();
        buffer.put("text");
        System.out.println(buffer.get());

        Buffer buffer1 = new ArrayBuffer();
        buffer1.put("text2");
        System.out.println(buffer1.get());


    }


}
