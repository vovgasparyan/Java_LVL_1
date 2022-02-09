package com.aca.homework.week5.pistol;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Guns[] guns = new Guns[4];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter pistol name");
            String name = scanner.next();

            if (Objects.equals(name, "air")) {
                Guns guns1 = new AirPistol(name);
                guns[i] = guns1;
            } else if (Objects.equals(name, "makarov")) {
                Guns guns1 = new MakarovPistol(name);
                guns[i] = guns1;
            } else if (Objects.equals(name, "nagant")) {
                Guns guns1 = new NagantPistol(name);
                guns[i] = guns1;
            } else {
                System.out.println(name + " is not found in GunStore");
            }
        }

        for (int i = 0; i < guns.length; i++) {
            guns[i].shoot();
        }
    }
}
