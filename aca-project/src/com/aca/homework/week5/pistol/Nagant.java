package com.aca.homework.week5.pistol;

public class Nagant extends Guns {

    public Nagant(String nagant) {
        super(nagant);
    }

    @Override
    public String getGunName() {
        return super.getGunName();
    }

    @Override
    public void shoot() {
        System.out.println(getGunName() + " fire!!!");
    }
}
