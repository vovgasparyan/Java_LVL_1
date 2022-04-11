package com.aca.classroom.week8.exception;

public class UserCreationException extends RuntimeException {

/*    public UserCreationException() {
        //this("message");

    }*/

    private Animal animal;

    public UserCreationException(Animal animal) {
        this.animal = animal;
    }

//    public UserCreationException(String message) {
//        super(message);
//    }

    public Animal getAnimal() {
        return animal;
    }
}
