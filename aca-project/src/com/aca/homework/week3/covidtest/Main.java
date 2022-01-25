package com.aca.homework.week3.covidtest;

public class Main {

    public static void main(String[] args) {

        CovidTest userMark = new CovidTest();
        userMark.positive = true;
        userMark.user = new User();
        userMark.user.name = "Mark";
        userMark.user.code = "mark789";

        CovidTest userJane = new CovidTest();
        userJane.positive = true;
        userJane.user = new User();
        userJane.user.name = "Jane";
        userJane.user.code = "jane45";

        CovidTest userKate = new CovidTest();
        userKate.positive = false;
        userKate.user = new User();
        userKate.user.name = "Kate";
        userKate.user.code = "kate876&";

        printCovidTest(userMark);
        printCovidTest(userJane);
        printCovidTest(userKate);

        System.out.println();

        userMark.print();
        userJane.print();
        userKate.print();

    }

    public static void printCovidTest(CovidTest covidTest) {
        if (covidTest.positive) {
            System.out.println("The covid test result of " + covidTest.user.name + " is positive. "
                    + covidTest.user.name + "'s code is: " + covidTest.user.code);
        } else {
            System.out.println("The covid test result of " + covidTest.user.name + " is negative. "
                    + covidTest.user.name + "'s code is: " + covidTest.user.code);
        }
    }
}
