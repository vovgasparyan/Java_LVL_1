package com.aca.homework.week13.race.condition.list;

public class NumberAdderRunnable implements Runnable {

    private List<Integer> list;
    private Integer number;

    public NumberAdderRunnable(List<Integer> list, Integer number) {
        this.list = list;
        this.number = number;
    }

    @Override
    public void run() {
        list.add(number);
    }

    public List<Integer> getList() {
        return list;
    }

    public Integer getNumber() {
        return number;
    }
}
