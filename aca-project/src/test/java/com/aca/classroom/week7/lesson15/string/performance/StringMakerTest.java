package com.aca.classroom.week7.lesson15.string.performance;

class StringMakerTest {

    public static void main(String[] args) {

        StringMaker badMaker = StringMaker.ofBad();
        System.out.println(badMaker.make(1, 100_000).getDuration());

        StringMaker goodMaker = StringMaker.ofGood();
        System.out.println(goodMaker.make(1, 100_000).getDuration());

        String test = "test string";
        StringBuilder stringBuilder = new StringBuilder(test);

        StringMaker[] array = new StringMaker[5];
        array[0] = StringMaker.ofBad();
        array[1] = StringMaker.ofBad();
        array[2] = StringMaker.ofGood();
        array[3] = StringMaker.ofGood();
        array[4] = StringMaker.ofGood();

        for (StringMaker stringMaker : array) {
            if (stringMaker instanceof LowPerformance) {
                System.out.println("The starting maker has low performance");
            }
        }

    }

}