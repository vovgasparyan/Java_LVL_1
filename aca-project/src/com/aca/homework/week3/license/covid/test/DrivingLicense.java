package com.aca.homework.week3.license.covid.test;

public class DrivingLicense {

    private User user;
    private final char[] licenseCategory = {'A', 'B', 'C', 'D', 'E'};

    public char[] getLicenseCategory() {
        return this.licenseCategory;
    }
}
