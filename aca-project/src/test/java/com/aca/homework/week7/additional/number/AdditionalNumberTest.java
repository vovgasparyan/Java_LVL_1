package com.aca.homework.week7.additional.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionalNumberTest {

    private final AdditionalNumber additionalNumber = new AdditionalNumber();

    @Test
    void differenceArrayElemTest1() {
        int[] array1 = {24, 4, 6, 8, 15};
        int[] array2 = {4, 6, 8, 24};

        assertEquals(15, this.additionalNumber.differenceArrayElements(array1, array2));
    }

    @Test
    void differenceArrayElemTest2() {
        int[] array1 = {65, 44, 86, 18, 25};
        int[] array2 = {25, 65, 86, 18};
        assertEquals(44, additionalNumber.differenceArrayElements(array1, array2));
    }


}