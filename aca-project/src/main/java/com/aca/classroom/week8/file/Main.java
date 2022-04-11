package com.aca.classroom.week8.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = null;

        try {
            scanner = new Scanner(
                    new File("D:/ACA/2.Java Level1/aca-project/src/main/com/aca/classroom/week8/file/text.txt")
            );
        } catch (Exception e) {

        } finally {
            scanner.close();
        }

        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

        //System.out.println(Arrays.toString(scanner.nextLine().split(" ")));
    }
}
