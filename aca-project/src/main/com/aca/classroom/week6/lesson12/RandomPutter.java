package com.aca.classroom.week6.lesson12;

public class RandomPutter  {

    private Buffer buffer;

    public RandomPutter(Buffer buffer) {
        this.buffer = buffer;
    }

    public void start() {

        for (int i = 0; ; i += 2) {
            this.buffer.put("text " + i);
            wait1Second();
            System.out.println(this.buffer.get());
            wait1Second();
        }
    }

    public void wait1Second() {
        long start = System.currentTimeMillis();
        while((System.currentTimeMillis() - start ) < 1000) {

        }
    }


}
