package com.aca.homework.week12.params;

public class UserUpdateParams {

    private final int size = 100;
    private final UserCreateParams[] userCreateParams = new UserCreateParams[size];
    private int index;

    public void add(UserCreateParams userCreateParams) {
        this.userCreateParams[this.index++] = userCreateParams;
    }

    public void updateUserName(String oldUserName, String newUserName) {
        for (int i = 0; i < index; i++) {
            if (oldUserName.equals(userCreateParams[i].getUsername())) {
                userCreateParams[i].setUsername(newUserName);
                System.out.println("'" + oldUserName + "' successfully updated on '" + newUserName + "' username");
                return;
            }
        }
        System.out.println(oldUserName + " username is not found");
    }

    public void updateFirstName(String oldFirstName, String newFirstName) {
        for (int i = 0; i < index; i++) {
            if (oldFirstName.equals(userCreateParams[i].getFirstName())) {
                userCreateParams[i].setFirstName(newFirstName);
                System.out.println("'" + oldFirstName + "' successfully updated on '" + newFirstName + "' username");
                return;
            }
        }
        System.out.println(oldFirstName + " firstname is not found");
    }

    public void updateAge(int oldAge, int newAge) {
        for (int i = 0; i < index; i++) {
            if (oldAge == userCreateParams[i].getAge()) {
                userCreateParams[i].setAge(newAge);
                System.out.println("'" + oldAge + "' successfully updated on '" + newAge + "' username");
                return;
            }
        }
        System.out.println(oldAge + " age is not found");
    }

    public void printParams() {
        for (int i = 0; i < index; i++) {
            System.out.println(userCreateParams[i].getUsername() + " " + userCreateParams[i].getFirstName() +
                    " " + userCreateParams[i].getAge());
        }
    }

    public int getSize() {
        return index;
    }


    public static void main(String[] args) {
        UserCreateParams user1 = new UserCreateParams("blade", "Vladimir", 40);
        UserCreateParams user2 = new UserCreateParams("emmy", "Emma", 34);

        UserUpdateParams userUpdateParams = new UserUpdateParams();
        userUpdateParams.add(user1);
        userUpdateParams.add(user2);

        userUpdateParams.printParams();
        userUpdateParams.updateUserName("emmy", "jack");
        userUpdateParams.printParams();

        userUpdateParams.updateFirstName("Emma", "Jack");
        userUpdateParams.updateAge(34, 36);
        userUpdateParams.printParams();




    }
}
