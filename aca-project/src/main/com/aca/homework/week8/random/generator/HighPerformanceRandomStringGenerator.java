package com.aca.homework.week8.random.generator;

public class HighPerformanceRandomStringGenerator implements RandomStringGenerator {

    @Override
    public Result randomString(int length) {
        long start = System.currentTimeMillis();
        if (length % 3 != 0) {
            return new Result("error", 0);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(Randomizer.randomString());
        }
        return new Result(stringBuilder.toString(), System.currentTimeMillis() - start);
    }
}
