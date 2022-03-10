package com.aca.homework.week5.pistol;

public class Guns {

    private String gunName;

    public Guns(String name) {
        this.gunName = name;
    }

    public String getGunName() {
        return this.gunName;
    }

    public void shoot() {
        System.out.println("Shooting from " + this.gunName);
    }
}
