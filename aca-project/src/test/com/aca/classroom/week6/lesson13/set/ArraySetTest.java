package com.aca.classroom.week6.lesson13.set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArraySetTest {

    private com.aca.classroom.week6.lesson13.set.Set testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = new ArraySet();
    }

    @Test
    public void testSizeWhenIsEmpty() {
        Assertions.assertEquals(0, testSubject.size());
    }

    @Test
    public void testSizeWhenOnlyOneUserIsAdded() {
        testSubject.add(new User("f", "l"));
        Assertions.assertEquals(1, testSubject.size());
    }

    @Test
    public void testSizeWhen5SameUsersWereAdded() {
/*        testSubject.add(new User("f", "l"));
        testSubject.add(new User("f", "l"));
        testSubject.add(new User("f", "l"));
        testSubject.add(new User("f", "l"));
        testSubject.add(new User("f", "l"));
        Assertions.assertEquals(1, testSubject.size());*/
        Integer[] ints = {1, 5, 6};
        method1(ints);
        Assertions.assertEquals(null, ints[0]);

    }

    public static void method1 (Integer[] array) {
        array[0] = null;
    }

/*    public static void main(String[] args) {

        Set set1 = new ArraySet();
        set1.add(new User("F", "L"));
        set1.add(new User("F", "L"));
        set1.add(new User("F", "L"));
        set1.add(new User("F", "L"));
        set1.add(new User("F", "L"));


    }*/
}