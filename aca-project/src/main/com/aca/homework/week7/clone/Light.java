package com.aca.homework.week7.clone;

public class Light implements Cloneable {

    private boolean lightState;

    private static Light lightIsOn = null;

    public Light(boolean lightState) {
        this.lightState = lightState;
    }

    public static Light turnOn(boolean light) {
        if (light) {
            if (lightIsOn == null) {
                lightIsOn = new Light(true);
            }
            return lightIsOn;
        }
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
