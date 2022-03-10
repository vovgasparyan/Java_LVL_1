package com.aca.homework.week9.donate;

public class AcaSmile<T extends Donatable> {

    private double totalDonationAmount;
    private String[] goodsList = new String[100];
    private static int index;

    public void buyWithDonation(T t) {
        System.out.println("The provided good is bought");
        totalDonationAmount += t.donationAmount();
        goodsList[index++] = t.toString();
    }

    public double getTotalDonationAmount() {
        return totalDonationAmount;
    }

    public String getSoldGoodName(int index) {
        return goodsList[index];
    }
}
