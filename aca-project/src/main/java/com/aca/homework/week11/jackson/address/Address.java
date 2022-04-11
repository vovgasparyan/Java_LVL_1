package com.aca.homework.week11.jackson.address;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Field;

public class Address {

    @JsonProperty("jsonFieldCountry")
    private String country;

    @JsonProperty("jsonFieldCity")
    private String city;

    @JsonProperty("jsonFieldStreet")
    private String street;


    public static void main(String[] args) throws NoSuchFieldException {

        Address address = new Address();
        Field country = Address.class.getDeclaredField("country");
        System.out.println(country.getAnnotation(JsonProperty.class).value());
    }
}
