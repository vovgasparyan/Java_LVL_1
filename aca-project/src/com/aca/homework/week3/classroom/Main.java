package com.aca.homework.week3.classroom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        String date1 = "01.01.2022 00:00";
        String date2 = "01.05.2022 00:00";

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");

        Date dateOne = format.parse(date1);
        Date dateTwo = format.parse(date2);


        AcaClass acaClass = new AcaClass();
        acaClass.name = "java level 1";
        acaClass.startMillis = dateOne.getTime();
        acaClass.endMillis = dateTwo.getTime();
        acaClass.fee = 500000;
        acaClass.students = new Student[10];

    }
}
