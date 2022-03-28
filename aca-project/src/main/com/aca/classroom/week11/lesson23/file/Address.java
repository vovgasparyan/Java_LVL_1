package com.aca.classroom.week11.lesson23.file;

import java.io.Serializable;

public class Address implements Serializable {

    private String country;
    private int number;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", number=" + number +
                '}';
    }
}
