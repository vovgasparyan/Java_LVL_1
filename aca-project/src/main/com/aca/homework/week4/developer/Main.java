package com.aca.homework.week4.developer;

public class Main {

    public static void main(String[] args) {

        Developer developer = new Developer();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        developer.setName("Gerard");
        developer.print();

        juniorDeveloper.setName("Maricar");
        juniorDeveloper.print();

        seniorDeveloper.setName("Emily");
        seniorDeveloper.print();
    }
}
