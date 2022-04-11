package com.aca.homework.week5.abstractphone;

public class Phone {

    private Model model;
    private String imei;

    public void setModel(Model model) {
        this.model = model;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Phone model is: " + model + ", imei is: '" + imei + "'";
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
