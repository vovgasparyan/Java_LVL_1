package com.aca.homework.week7.clone;

public class Light implements Cloneable {

    private boolean lightState;

    public Light(boolean lightState) {
        this.lightState = lightState;
    }

    public static Light ofLightOn() {
        return new Light(true);
    }

    public static Light ofLightOff() {
        return new Light(false);
    }

    @Override
    protected Light clone() throws CloneNotSupportedException {
        return (Light) super.clone();
    }

    @Override
    public String toString() {
        if (lightState) {
            return "The lightState is 'on'";
        }
        return "The lightState is 'off'";
    }
}
