package com.aca.homework.week5.pistol;

public class AirPistol extends Guns {

    public AirPistol(String name) {
        super(name);
    }

    @Override
    public String getGunName() {
        return super.getGunName();
    }

    @Override
    public void shoot() {
        System.out.println(getGunName() + "pistol fire!");
    }
}
