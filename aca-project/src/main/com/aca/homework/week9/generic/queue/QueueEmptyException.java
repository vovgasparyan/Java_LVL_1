package com.aca.homework.week9.generic.queue;

public class QueueEmptyException extends RuntimeException {

    public QueueEmptyException() {
        super("The queue is empty");
    }
}
