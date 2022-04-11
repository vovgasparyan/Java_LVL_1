package com.aca.classroom.week10.lesson20;

import java.util.List;

public class Main {

    public static void main(String[] args) {

/*        Runnable mulRunnable = new MulRunnable(4, 9);
        Runnable subRunnable = new SubtractionRunnable(20, 8);
        Runnable sumRunnable = new RunnableImpl(15, 8);

        List<Runnable> list = new ArrayList<>();
        list.add(mulRunnable);
        list.add(subRunnable);
        list.add(sumRunnable);

        mutate(list);
        runRunnable(list);*/

/*        Map<String, Integer> map = new HashMap<>();
        map.put("Dell", 2000);

        System.out.println(map);

        Integer dell = map.get("Dell");
        System.out.println(dell);*/


    }

    public static void runRunnable(List<Runnable> runnableList) {
        for (Runnable runnable : runnableList) {
            runnable.run();
        }
    }

    public static void mutate(List<Runnable> runnableList) {
        runnableList.remove(0);
    }
}
