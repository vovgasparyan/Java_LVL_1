package com.aca.homework.week5.abstractphone;

import java.util.Objects;

public class PhoneService extends AbstractPhoneService {


    private static int index = 0;
    private Phone[] phones = new Phone[4];

    @Override
    public Phone create(String imei, Model model) {
        Phone phone = new Phone();
        phone.setModel(model);
        phone.setImei(imei);
        this.phones[index] = phone;
        index++;
        return phone;
    }

    @Override
    public Phone getByImei(String imei) {
        for (Phone phone : this.phones) {
            if (Objects.equals(imei, phone.getImei())) {
                return phone;
            }
        }
        return null;
    }
}
