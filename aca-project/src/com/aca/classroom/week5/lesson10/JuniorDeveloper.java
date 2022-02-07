package com.aca.classroom.week5.lesson10;

public class JuniorDeveloper extends Developer {

    private long salary;

    public JuniorDeveloper() {
        super("some text");
    }

    public JuniorDeveloper (String name, long salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public long getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        JuniorDeveloper yan = new JuniorDeveloper("Yan", 45_000);
        System.out.println(yan.toString());
    }
}
