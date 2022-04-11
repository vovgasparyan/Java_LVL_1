package com.aca.classroom.week8.buffer.generic;

public class Buckets {

    private Buffer<Integer> buffer1;
    private Buffer<Long> buffer2;
    private Buffer<String> buffer3;
    private Buffer<Double> buffer4;

    public static void main(String[] args) {
        Integer integer = 5;
        Long along = 50L;
        String string = "Text";
        Double d = 10.5d;

        Buckets buckets = new Buckets();

        buckets.buffer1 = new BufferImpl<>();
        buckets.buffer1.put(integer);

        buckets.buffer2 = new BufferImpl<>();
        buckets.buffer2.put(along);

        buckets.buffer3 = new BufferImpl<>();
        buckets.buffer3.put(string);

        buckets.buffer4 = new BufferImpl<>();
        buckets.buffer4.put(d);

        printStringBufferFirstSymbol(buckets);
    }

    private static void printStringBufferFirstSymbol(Buckets buckets) {
        String text = buckets.buffer3.get();
        System.out.println(text.charAt(0));
    }
}
