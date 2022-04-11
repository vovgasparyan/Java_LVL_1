package com.aca.homework.week7.singleton;

class SingletonUserServiceTest {

    public static void main(String[] args) {

        SingletonUserService userService1 = SingletonUserService.getInstance();
        SingletonUserService userService2 = SingletonUserService.getInstance();
        SingletonUserService userService3 = SingletonUserService.getInstance();
        SingletonUserService userService4 = SingletonUserService.getInstance();

        System.out.println(userService1 == userService2);
        System.out.println(userService2 == userService3);
        System.out.println(userService3 == userService4);
        System.out.println(userService4 == userService1);
        System.out.println(userService1 == userService3);
        System.out.println(userService2 == userService4);
    }

}