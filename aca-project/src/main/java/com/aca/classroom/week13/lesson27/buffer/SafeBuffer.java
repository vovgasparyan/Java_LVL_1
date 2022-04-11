package com.aca.classroom.week13.lesson27.buffer;

public final class SafeBuffer<T> implements Buffer<T> {

    private T value;

    @Override
    public synchronized T get() throws InterruptedException {
        while (value == null) {
            //System.out.println("Can not get() a value. Waiting...");
            wait();
            //System.out.println("After get() wait");
        }
        T valueToReturn = value;
        value = null;
        //System.out.println("Before get() notify all");
        this.notifyAll();
        //System.out.println("After get() notify all");

        return valueToReturn;
    }

    @Override
    public synchronized void put(T t) throws InterruptedException {
        if (t == null) {
            throw new IllegalArgumentException("The provided value is null");
        }
        while (value != null) {
            //System.out.println("Can not put() a value. Waiting...");
           this.wait();
            //System.out.println("After put() wait");
        }
        this.value = t;
        //System.out.println("Before put() notify all");
        notifyAll();
        //System.out.println("After put() notify all");
    }

    public static void main(String[] args) {
        final Buffer<Integer> buffer = new BlockingBuffer<>();

        for (int i = 0; i < 100; i++) {
            final int finalI = i;
            Runnable putRunnable = () -> {
                try {
                    buffer.put(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            new Thread(putRunnable).start();
        }

        for (int i = 0; i < 1000; i++) {
            Runnable getRunnable = () -> {
                try {
                    System.err.println("Printing: " + buffer.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            new Thread(getRunnable).start();
        }


    }
}
