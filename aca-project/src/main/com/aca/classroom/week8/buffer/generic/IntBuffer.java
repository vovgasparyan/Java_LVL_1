package com.aca.classroom.week8.buffer.generic;

public class IntBuffer extends BufferImpl<Integer> {

    public static void main(String[] args) {
        IntBuffer intBuffer = new IntBuffer();
        Buffer<Integer> integerBuffer = new IntBuffer();
        BufferImpl<Integer> buffer = new IntBuffer();
    }

    /*
    Buffer -> BufferImpl -> IntBuffer
     */
}
