package main.com.aca.homework.week9.donate;

public class SmartWatch extends Goods implements Donatable {

    public SmartWatch(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "SmartWatch's price is: " + getPrice() + ", donation amount is: " + donationAmount();
    }
}
