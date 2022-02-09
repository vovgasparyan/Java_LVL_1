package com.aca.homework.week5.pistol;

public class MakarovPistol extends Guns {

    public MakarovPistol(String name) {
        super(name);
    }

    @Override
    public String getGunName() {
        return super.getGunName();
    }

    @Override
    public void shoot() {
        System.out.println(getGunName() + " fire!!");
    }
}
