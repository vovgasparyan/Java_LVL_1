package com.aca.homework.week4.developer;

public class JuniorDeveloper extends Developer {

    @Override
    public int getLearningBudget() {
        return super.getLearningBudget() * 2;
    }

    @Override
    public int getSalary() {
        return super.getSalary() * 5;
    }

    @Override
    public void print() {
        super.print();
    }
}
