package com.aca.homework.week5.pistol;

public class Makarov extends Guns {

    public Makarov(String makarov) {
        super(makarov);
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
