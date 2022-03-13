package com.aca.homework.week10.concrete.map;

import java.util.ArrayList;

public class Map {

    private ArrayList<PairList<String, String>> pairArrayList = new ArrayList<>();
    private int index;

    public void put(@NotNull String key, @NotNull String value) {
        if (key == null) {
            throw new IllegalArgumentException("The 'key' is null.");
        }
        if (value == null) {
            throw new IllegalArgumentException("The 'value' is null.");
        }
        pairArrayList.add(new PairList<>(key, value));
        index++;
    }

    public String getValue(String key) {
        if (key == null) {
            throw new IllegalArgumentException("key is null.");
        }
        for (PairList<String, String> pair : pairArrayList) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return this.index == 0;
    }
}
