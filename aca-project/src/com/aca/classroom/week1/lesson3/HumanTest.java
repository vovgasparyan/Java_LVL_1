package com.aca.classroom.week1.lesson3;

import java.util.Scanner;

public class HumanTest {

    public static void main(String[] args) {

        System.out.println(getConditionText());
    }

    public static boolean isHeightLowerThen180() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք հասակը");
        final int height = scanner.nextInt();
        return height < 180;
    }

    public static boolean isAgeGt59() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք տարիքը");
        final int age = scanner.nextInt();
        return age < 59;
    }

    public static boolean isWeightEq50() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք քաշը");
        final int weight = scanner.nextInt();
        return weight == 50;
    }

    public static String getConditionText() {
        boolean heightLowerThan180 = isHeightLowerThen180();
        boolean weightEq = isWeightEq50();
        if ((heightLowerThan180 && weightEq) || (heightLowerThan180 && weightEq && !isAgeGt59())) {
            return "Պայմանը բավարարված է";
        }
        return "Պայմանը բավարարված չէ";
    }
}
