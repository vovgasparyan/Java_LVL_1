package com.aca.classroom.week10.lesson20.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("username1", 15);
        System.out.println(user1.hashCode());

        User user2 = new User("username2", 20);
        System.out.println(user2.hashCode());

        User user3 = new User("username2", 20);
        System.out.println(user3.hashCode());

        User user4 = new User("username4", 45);
        Map<User, Integer> map = new HashMap<>();
        map.put(user4, 1);

        user4.setAge(19);

        System.out.println(map.containsKey(user4));
    }
}
