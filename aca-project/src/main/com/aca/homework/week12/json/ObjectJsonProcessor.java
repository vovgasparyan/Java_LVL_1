package com.aca.homework.week12.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Field;

public class ObjectJsonProcessor {

    public String process(Object o) throws NoSuchFieldException, IllegalAccessException {

        StringBuilder result = new StringBuilder();
        Field[] fields = o.getClass().getDeclaredFields();

        result.append("{");

        for (Field field : fields) {
            field.setAccessible(true);
            if (field.get(o) == null) {
                throw new IllegalAccessException("The " + o + " doesn't contain " + field);
            }
            result.append("\"").append(field.getDeclaredAnnotation(JsonProperty.class).value()).append("\"");
            result.append(": ");
            result.append("\"").append(field.get(o).toString()).append("\"");
            result.append(", ");

        }
        result.delete(result.length() - 2, result.length());
        result.append("}");

        return result.toString();
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ObjectJsonProcessor processor = new ObjectJsonProcessor();
        User user = new User("blade", "Vladimir", 40);
        System.out.println(processor.process(user));

    }
}
