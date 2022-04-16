package com.aca.homework.week15.sql.generate;

import java.lang.reflect.Field;

public class SQLGenerator {

    public String generateInsert(User user) throws NoSuchFieldException {
        String sqlQuery = null;
        Field name = user
                .getClass()
                .getDeclaredField("name");
        Field age = user
                .getClass()
                .getDeclaredField("age");
        Table[] table = User
                .class.getAnnotationsByType(Table.class);
        sqlQuery = "insert into " + table[0].name() + " (" + name.getAnnotation(Column.class).name() + ", "
                + age.getAnnotation(Column.class).name() + ") values ('" + user.getName() + "', " + user.getAge() + ");";
        return sqlQuery;
    }

}
