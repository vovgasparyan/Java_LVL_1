package com.aca.homework.week8.payment.service;

public class PaymentResult {

    private int paidAmount;
    private int timeProcessing;

    public PaymentResult(int paidAmount, int timeProcessing) {
        this.paidAmount = paidAmount;
        this.timeProcessing = timeProcessing;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public int getTimeProcessing() {
        return timeProcessing;
    }
}
