package com.aca.homework.week14.shared.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SharedListMain {

    private final List<Integer> sharedList = Collections.synchronizedList(new ArrayList<>());

    public int execute() {

        for (int i = 0; i < 1000; i++) {
            NumberAdderRunnable runnable = new NumberAdderRunnable(sharedList, i);
            runnable.run();
        }
        return sharedList.size();
    }

    public static void main(String[] args) {
        SharedListMain listMain = new SharedListMain();
        System.out.println(listMain.execute());
    }
}
