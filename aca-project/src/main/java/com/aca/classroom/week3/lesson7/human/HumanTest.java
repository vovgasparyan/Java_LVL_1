package com.aca.classroom.week3.lesson7.human;

public class HumanTest {

    public static void main(String[] args) {
        Human human1 = new Human();

        human1.setHeight(45);
        human1.setName("Jane");

        Human human2 = new Human();
        human2.setHeight(170);
        human2.setName("Alex");

        System.out.println(human1.getStringRepresentation());

    }
}
