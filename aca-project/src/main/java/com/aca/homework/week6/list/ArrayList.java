package com.aca.homework.week6.list;

public class ArrayList implements List {

    private String[] strings = new String[10];
    private int elem = 0;

    @Override
    public void add(String element) {
        if (elem == strings.length) {
            String[] newStrings = new String[2 * strings.length];
            strings = copyArrayContent(newStrings);
        }
        strings[elem] = element;
        elem++;
    }

    @Override
    public String get(int index) {
        if (index >= 0 || index < elem) {
            return this.strings[index];
        }
        throw new RuntimeException();
    }

    public String[] copyArrayContent(String[] copiedArray) {
        for (int i = 0; i < strings.length; i++) {
            copiedArray[i] = strings[i];
        }
        return copiedArray;
    }
}
