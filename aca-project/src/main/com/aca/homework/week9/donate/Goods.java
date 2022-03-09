package com.aca.homework.week9.donate;

public class Goods implements Donatable {

    private double price;

    public Goods(double price) {
        this.price = price;
    }

    @Override
    public double donationAmount() {
        return this.price * 5 / 100;
    }

    public double getPrice() {
        return price;
    }
}
