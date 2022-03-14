package com.aca.classroom.week10.lesson19;

import java.util.*;

public class Main<T> {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1000);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(0);

/*        System.out.println(list);
        list.remove((Object)1);
        System.out.println(list);*/

        Iterator<Integer> iterator = list.iterator();
/*        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/

//        if(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

/*        for (Integer integer : list) {
            System.out.println(iterator.next());
        }*/

        /**
        while (iterator.hasNext()) {
            if (iterator.next() == 4) {
                iterator.remove();
            }
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
         */

/*        List<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list1.add(i);
        }

        printAll(list1);*/

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = Collections.emptyList();

    }

    public static void printAll(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
