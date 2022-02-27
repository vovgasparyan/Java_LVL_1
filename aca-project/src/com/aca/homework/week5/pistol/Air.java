package com.aca.homework.week5.pistol;

public class Air extends Guns {

    public Air(String air) {
        super(air);
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
