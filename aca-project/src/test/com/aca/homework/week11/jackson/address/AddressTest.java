package com.aca.homework.week11.jackson.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

class AddressTest {

    @Test
    public void testCountryFieldAnnotation() throws NoSuchFieldException {
        Field country = Address.class.getDeclaredField("country");
        Assertions.assertEquals("jsonFieldCountry", country.getAnnotation(JsonProperty.class).value());
    }

    @Test
    public void testCityFieldAnnotation() throws NoSuchFieldException {
        Field city = Address.class.getDeclaredField("city");
        Assertions.assertEquals("jsonFieldCity", city.getAnnotation(JsonProperty.class).value());
    }

    @Test
    public void testStreetFieldAnnotation() throws NoSuchFieldException {
        Field street = Address.class.getDeclaredField("street");
        Assertions.assertEquals("jsonFieldStreet", street.getAnnotation(JsonProperty.class).value());
    }


}