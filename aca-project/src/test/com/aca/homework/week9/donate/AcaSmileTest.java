package test.com.aca.homework.week9.donate;

import main.com.aca.homework.week9.donate.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AcaSmileTest {

    @Test
    public void testWhenNothingIsBought() {
        AcaSmile<Smartphone> smartphoneAcaSmile = new AcaSmile<>();
        Assertions.assertEquals(0, smartphoneAcaSmile.getTotalDonationAmount());
    }

    @Test
    public void testWhenOneSmartphoneIsBought() {
        AcaSmile<Smartphone> smartphoneAcaSmile = new AcaSmile<>();
        Smartphone smartphone = new Smartphone(100);
        smartphoneAcaSmile.buyWithDonation(smartphone);
        Assertions.assertEquals(5, smartphoneAcaSmile.getTotalDonationAmount());

    }

    @Test
    public void testWhenOneSmartphoneAndOneWatchIsBought() {
        AcaSmile<Goods> goodsAcaSmile = new AcaSmile<>();
        Smartphone smartphone = new Smartphone(100);
        Watch watch = new Watch(200);
        goodsAcaSmile.buyWithDonation(smartphone);
        goodsAcaSmile.buyWithDonation(watch);
        Assertions.assertEquals(15, goodsAcaSmile.getTotalDonationAmount());
    }

    @Test
    public void testWhenOneSmartphoneOneWatchAndOneSmartWatchIsBought() {
        AcaSmile<Goods> goodsAcaSmile = new AcaSmile<>();
        Smartphone smartphone = new Smartphone(100);
        Watch watch = new Watch(200);
        SmartWatch smartWatch = new SmartWatch(1000);
        goodsAcaSmile.buyWithDonation(smartphone);
        goodsAcaSmile.buyWithDonation(watch);
        goodsAcaSmile.buyWithDonation(smartWatch);
        Assertions.assertEquals(65, goodsAcaSmile.getTotalDonationAmount());
    }

    @Test
    public void testStringRepresentations() {
        AcaSmile<Goods> goodsAcaSmile = new AcaSmile<>();
        goodsAcaSmile.buyWithDonation(new Smartphone(100));
        goodsAcaSmile.buyWithDonation(new Watch(200));
        goodsAcaSmile.buyWithDonation(new SmartWatch(1000));
        List<String> list = goodsAcaSmile.goodsListArray();
        Assertions.assertEquals("Smartphone's price is: 100.0, donation amount is: 5.0", list.get(0));
        Assertions.assertEquals("Watch's price is: 200.0, donation amount is: 10.0", list.get(1));
        Assertions.assertEquals("SmartWatch's price is: 1000.0, donation amount is: 50.0", list.get(2));
    }

}