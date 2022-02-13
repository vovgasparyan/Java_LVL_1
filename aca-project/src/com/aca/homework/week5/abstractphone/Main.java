package com.aca.homework.week5.abstractphone;

public class Main {

    public static void main(String[] args) {

        PhoneService phone = new PhoneService();

        phone.create("351978946541895", Model.SAMSUNG);
        phone.create("45678974132187", Model.IPHONE);
        phone.create("04894100487866", Model.IPHONE);
        phone.create("99987741084444", Model.NOKIA);

        String findPhoneByImei = "04894100487866";

        if (phone.getByImei(findPhoneByImei) == null) {
            System.out.println("With this imei phone not found");
        } else {
            System.out.println(phone.getByImei(findPhoneByImei));
        }

    }
}
