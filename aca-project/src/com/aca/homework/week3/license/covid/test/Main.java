package com.aca.homework.week3.license.covid.test;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        user.setName("Vova");
        String name = user.getName();

        user.setUsername("vova_gasparyan");
        String username = user.getUsername();

        CovidTest userForCovidTest = new CovidTest();


        DrivingLicense drivingLicense = new DrivingLicense();
        drivingLicense.getLicenseCategory();

        char[] userDrivingLicenseList = drivingLicense.getLicenseCategory();
        String userDrivingLicense = userDrivingLicenseList[1] + "" + userDrivingLicenseList[2];

        System.out.println("The policeman stopped " + name +
                " who had to show his driving license of " + userDrivingLicense + " type.\nUsername: '"
        + username + "' covid test result is: " + userForCovidTest.test());


    }
}
