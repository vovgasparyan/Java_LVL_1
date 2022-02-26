package com.aca.homework.week5.equals;

public class Motorcycle {

    private MotoType motoType;
    private Owner owner;

    public Motorcycle(MotoType motoType, Owner owners) {
        this.motoType = motoType;
        this.owner = owners;
    }

    @Override
    public String toString() {
        return "The owner of mototype " + motoType + " is " + owner.getFirstName() + " " + owner.getLastName();
    }

    @Override
    public boolean equals(Object obj) {
        Motorcycle motorcycle = (Motorcycle) obj;

        if (obj == null || obj.getClass() != Motorcycle.class) {
            return false;
        }

        return motorcycle.motoType.equals(this.motoType);
    }
}
