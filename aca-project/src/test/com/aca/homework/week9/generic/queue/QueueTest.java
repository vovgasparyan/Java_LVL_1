package com.aca.homework.week9.generic.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class QueueTest {

    private Queue<String> testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = new Queue<>();
    }

    @Test
    public void testWhenProduceIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                testSubject.produce(null);
            }
        });
    }

    @Test
    public void testConsumeWhenContains1Item() {
        testSubject.produce("First text");
        Assertions.assertEquals( testSubject.consume(), "First text");
    }

    @Test
    public void testConsumeWhenQueueIsEmpty() {
        Assertions.assertThrows(QueueEmptyException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                testSubject.consume();
            }
        });
    }

    @Test
    public void testConsume2TimesWhenQueueContains2Items() {
        testSubject.produce("First text");
        testSubject.produce("Second text");
        testSubject.consume();
        Assertions.assertEquals(testSubject.differenceOfElements(), 1);
    }

}