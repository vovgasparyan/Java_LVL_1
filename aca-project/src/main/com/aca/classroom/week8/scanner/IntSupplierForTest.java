package com.aca.classroom.week8.scanner;

import java.util.InputMismatchException;

public class IntSupplierForTest implements IntSupplier {

    private int count;

    @Override
    public int get() {
        count++;
        if (count == 1) {
            throw new InputMismatchException();
        } else if (count == 2) {
            throw new InputMismatchException();
        } else if (count == 3) {
            return 4;
        } else if(count == 4) {
            return 5;
        } else if (count == 5) {
            return 6;
        }
        return 9;
    }
}
