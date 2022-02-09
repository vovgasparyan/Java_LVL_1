package com.aca.homework.week5.pistol;

public class NagantPistol extends Guns {

    public NagantPistol(String name) {
        super(name);
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
