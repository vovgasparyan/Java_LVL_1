package com.aca.classroom.week13.lesson26.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class SynchCollection {

    public static void main(String[] args) {

        //List<Integer> sharedList = new Vector<>();
/*        List<Integer> sharedList = Collections.synchronizedList(
                new ArrayList<>()
        );*/
        List<Integer> sharedList = new CopyOnWriteArrayList<>();

        Executor executor1 = Executors.newFixedThreadPool(16);
        ExecutorService executor2 = Executors.newCachedThreadPool();

        List<Future<?>> futureList = new ArrayList<>();


//        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 150; i++) {

            Runnable runnable = new Runnable() {

                @Override
                public void run() {
                    for (int j = 0; j < 15; j++) {
                        sharedList.add(new Random().nextInt());
                    }
                }
            };
//            Thread thread = new Thread(runnable);
//            thread.start();
//            threadList.add(thread);


            Future<?> future = executor2.submit(runnable);
            futureList.add(future);

        }

/*
        threadList.forEach(new Consumer<Thread>() {
            @Override
            public void accept(Thread thread) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
*/
        executor2.shutdown();

        futureList.forEach(future -> {
            try {
                future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

/*
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(sharedList.size());
            }
        }).start();
*/
        System.out.println(sharedList.size());

    }
}
