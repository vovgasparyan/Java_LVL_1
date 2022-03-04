package com.aca.homework.week8.payment.service;

import java.util.Random;

@Service
public class PaymentService {

    public PaymentResult pay(int money) {
        int timeProcessing = waitSomeMillis(200, 600);
        System.out.println("The payment is done!");
        return new PaymentResult(money, timeProcessing);
    }

    public static int waitSomeMillis(int from, int to) {
        long start = System.currentTimeMillis();
        int waitTime = new Random().nextInt((to - from) + 1) + from;
        while((System.currentTimeMillis() - start) < waitTime);
        return waitTime;
    }

}
