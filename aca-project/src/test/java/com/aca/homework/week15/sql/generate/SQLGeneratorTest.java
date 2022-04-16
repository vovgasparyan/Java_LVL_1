package com.aca.homework.week15.sql.generate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQLGeneratorTest {

    @Test
    public void testSQLQuery() throws NoSuchFieldException {
        SQLGenerator generator = new SQLGenerator();
        Assertions.assertEquals("insert into users (full_name, age) values ('john kehoe', 45);",
                generator.generateInsert(new User("john kehoe", 45)));
    }

}