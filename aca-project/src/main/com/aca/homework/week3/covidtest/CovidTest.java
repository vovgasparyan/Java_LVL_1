package com.aca.homework.week3.covidtest;

public class CovidTest {

    boolean positive;
    User user;

    public void print() {
        String userPrint = this.user.getPrintTest();
        if (this.positive) {
            System.out.println("The covid test result of " + user.name + " is positive. " + userPrint);
        } else {
            System.out.println("The covid test result of " + user.name + " is negative. " + userPrint);
        }
    }
}
