package com.aca.homework.week9.donate;

public class Watch extends Goods implements Donatable {

    public Watch(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Watch's price is: " + getPrice() + ", donation amount is: " + donationAmount();
    }
}
