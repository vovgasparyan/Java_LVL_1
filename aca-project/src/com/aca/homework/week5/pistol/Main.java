package com.aca.homework.week5.pistol;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Guns[] guns = new Guns[4];

        Scanner scanner = new Scanner(System.in);

        int index = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter pistol name");
            String name = scanner.next();

            Guns gun = null;
            if (Objects.equals(name, "air")) {
                gun = new AirPistol(name);
            } else if (Objects.equals(name, "makarov")) {
                gun = new MakarovPistol(name);
            } else if (Objects.equals(name, "nagant")) {
                gun = new NagantPistol(name);
            } else {
                System.out.println(name + " is not found in GunStore");
                index--;
            }

            if (gun != null) {
                guns[index] = gun;
            }
            index++;
        }

        for (Guns guns1 : guns) {
            if (guns1 != null) {
                guns1.shoot();
            }
        }
    }
}
