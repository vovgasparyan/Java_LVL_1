package com.aca.homework.week8.random.generator;

public class LowPerformanceRandomStringGenerator implements RandomStringGenerator {

    @Override
    public Result randomString(int length) {
        long start = System.currentTimeMillis();
        if (length % 3 != 0) {
            return new Result("error", 0);
        }
        String tempText = "";
        for (int i = 0; i < length; i++) {
            tempText += Randomizer.randomString();
        }
        return new Result(tempText, System.currentTimeMillis() - start);
    }
}
