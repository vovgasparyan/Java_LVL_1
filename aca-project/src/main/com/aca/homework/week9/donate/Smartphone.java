package main.com.aca.homework.week9.donate;

public class Smartphone extends Goods implements Donatable {

    public Smartphone(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Smartphone's price is: " + getPrice() + ", donation amount is: " + donationAmount();
    }
}
