package com.aca.homework.week14.shared.list;

import java.util.List;

public class NumberAdderRunnable implements Runnable {

    private List<Integer> sharedList;
    private int number;

    public NumberAdderRunnable(List<Integer> sharedList, int number) {
        this.sharedList = sharedList;
        this.number = number;
    }

    @Override
    public void run() {
        sharedList.add(number);
    }
}
