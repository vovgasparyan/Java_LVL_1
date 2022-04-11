package com.aca.homework.week4.developer;

public class SeniorDeveloper extends Developer {

    @Override
    public int getLearningBudget() {
        return super.getLearningBudget() * 8;
    }

    @Override
    public int getSalary() {
        return super.getSalary() * 10;
    }

    @Override
    public void print() {
        super.print();
    }
}
