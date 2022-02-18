package com.aca.homework.week4.json.processor;

public class StringProcessor {

    private final String json;

    public StringProcessor(String inputString) {
        this.json = inputString;
    }

    public String getJson() {
        return this.json;
    }

    public String getValue(String key) {
        String str = getJson();
        str = str.replace('{', ' ').replace('}', ' ').trim();
        str = str.replaceAll("\"", "");

        String stringDelimiter = ",";
        String[] arrSubString = str.split(stringDelimiter);

        for (int i = 0; i < arrSubString.length; i++) {
            arrSubString[i] = arrSubString[i].trim();
        }

        int j = 0;

        String[] keys = new String[arrSubString.length];
        String[] values = new String[arrSubString.length];

        while (j < arrSubString.length) {
            for (int i = 0; i < arrSubString[j].length(); i++) {
                if (arrSubString[j].charAt(i) == ':') {
                    keys[j] = arrSubString[j].substring(0, i);
                    values[j] = arrSubString[j].substring(i).replaceAll("\\s", "").replaceAll(":", "");
                }
            }
            j++;
        }
        String finalValue = "";
        for (int i = 0; i < keys.length; i++) {
            if (key.equals(keys[i])) {
                finalValue = values[i];
                break;
            } else {
                finalValue = "end";
            }
        }

        return finalValue;
    }
}
