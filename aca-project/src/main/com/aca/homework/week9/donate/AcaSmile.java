package main.com.aca.homework.week9.donate;

import java.util.ArrayList;
import java.util.List;

public class AcaSmile<T extends Donatable> {

    private double totalDonationAmount;
    private List<String> goodsList = new ArrayList<>();
    private int index;

    public void buyWithDonation(T t) {
        System.out.println("The provided good is bought");
        totalDonationAmount += t.donationAmount();
        goodsList.add(t.toString());
    }

    public double getTotalDonationAmount() {
        return totalDonationAmount;
    }

    public String getSoldGoodName(int index) {
        return goodsList.get(index);
    }

    public List<String> goodsListArray() {
        return goodsList;
    }
}
