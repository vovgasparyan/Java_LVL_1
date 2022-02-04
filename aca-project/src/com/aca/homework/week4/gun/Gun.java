package com.aca.homework.week4.gun;

public class Gun {

    private static int cartridges = 10;

    public static void fire() {
        if (cartridges == 0) {
            System.out.println("Cartridge is empty! Please load cartridge to fire.");
        } else {
            System.out.println("Fire!!!");
            cartridges--;
        }
    }

    public static void loadCartridge() {
        if (cartridges > 0) {
            System.out.println("Cartridge is not empty! You can fire until cartridge empty");
        } else {
            cartridges = 10;
        }
    }

    public static void main(String[] args) {

        fire();
        fire();
        fire();
        fire();
        fire();
        fire();
        fire();
        fire();
        fire();
        loadCartridge();
        fire();
        fire();
        loadCartridge();
        fire();
        fire();

    }
}
