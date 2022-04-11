package com.aca.classroom.week5.lesson10;

public class Developer {

    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return 60000;
    }

    public int getLearningBudget() {
        return 300;
    }

    @Override
    public String toString() {
        return "name " + getName() + " salary " + getSalary();
    }

    @Override
    public boolean equals(Object o) {
        Developer o1 = (Developer) o;
        return this.name == o1.name;
    }


    public static void main(String[] args) {
        Developer developer = new Developer("Kate");

        Developer developer1 = new Developer("Arman");
        Developer developer2 = new Developer("Arman");
        Developer developer3 = developer2;

        System.out.println(developer1 == developer2);
        System.out.println(developer1.equals(developer2));
        System.out.println(developer3 == developer2);

    }

}
