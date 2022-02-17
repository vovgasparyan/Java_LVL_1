package com.aca.homework.week4.developer;

public class Developer {

    private String name;

    public int getSalary() {
        return 60000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLearningBudget() {
        return 300;
    }

    public void print() {
        System.out.println("name: " + getName() + ", salary: " + getSalary() + ", learning budget: " +
                getLearningBudget());
    }
}
