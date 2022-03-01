package com.aca.classroom.week8.exception;

public class CheckedMain {

    public static void main(String[] args) {
        try {
            createUser();
        } catch (Exception e) {
            e.printStackTrace();

            if(e instanceof UserCreationException) {
                UserCreationException userCreationException = (UserCreationException) e;
                System.out.println(userCreationException.getAnimal());
            }
        }
        System.out.println("Finished");
    }

    public static void createUser() throws Exception {
        User user = null;
        throw new UserCreationException(Animal.DOG);
    }

}
