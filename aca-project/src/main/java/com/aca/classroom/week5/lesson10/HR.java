package com.aca.classroom.week5.lesson10;

public class HR {

    public static void main(String[] args) {
        Developer junior1 = new JuniorDeveloper("Eric", 300_000);
        Developer junior2 = new JuniorDeveloper("Jane", 350_000);
        Developer junior3 = new JuniorDeveloper("Jane", 290_000);

        Developer[] juniorDevelopers = {junior1, junior2, junior3};

        Developer mid1 = new MidDeveloper("Yan");
        Developer mid2 = new MidDeveloper("Gascony");

        Developer[] devs = {junior1, junior2, junior3, mid1, mid2};

        //System.out.println(calculateSalary(devs));


        Developer junior4 = new JuniorDeveloper("Eric", 300_000);
        //printSalary(junior4);

        Printers.printAll(devs);

    }

    public static void printSalary(Developer developer) {
        System.out.println(developer.getSalary());
    }

    public static long calculateSalary(Developer[] devs) {
        long sum = 0 ;
        for (int i = 0; i < devs.length; i++) {
            sum += devs[i].getSalary();
        }
        return sum;
    }


}
