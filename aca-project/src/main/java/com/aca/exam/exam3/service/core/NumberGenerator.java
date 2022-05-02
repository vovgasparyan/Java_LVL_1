package com.aca.exam.exam3.service.core;

import java.util.Random;

public class NumberGenerator {

    public String generateRandomNumber() {

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String counts = "0123456789";

        Random random = new Random();
        StringBuilder let = new StringBuilder(2);
        StringBuilder count = new StringBuilder(3);
        for (int i = 0; i < 2; i++) {
            let.append(letters.charAt(random.nextInt(letters.length())));
        }

        for (int i = 0; i < 3; i++) {
            count.append(counts.charAt(random.nextInt(counts.length())));
        }

        return let.toString() + " " + count.toString();

    }
}
