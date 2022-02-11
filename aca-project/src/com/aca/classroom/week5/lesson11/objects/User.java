package com.aca.classroom.week5.lesson11.objects;

public class User {


    private String name;
    private String password;
    private int age;

    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        User user = (User) obj;
//       Integer integerAge = user.age;
//       Integer integerThis = this.age;
//       return integerAge.equals(integerThis);
//    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != User.class) {
            return false;
        }

        User user = (User) obj;

        //return true; // եթե չլինի տվյալ կլասսում equals() մեթոդը, ապա object կլասսից կանչելու ժամանակ, կվերադարձնի false
        return user.age == this.age
                && user.name.equals(this.name)
                && user.password.equals(this.password);
    }

    public static void main(String[] args) {
        User user1 = new User("Koryun", "koryun2005", 16);
        User user2 = new User("Koryun", "koryun2005", 16);
        User user3 = new User("Koryun1", "koryun2005", 16);
        User user4 = new User("Koryun1", "koryun20054", 16);
        User user5 = new User("Koryun", "koryun2005", 16);
        ChildUser subUser1 = new ChildUser("Vov", "123456", 39);

        //System.out.println(user1 == user2);

        //System.out.println(user1.equals(user2));

        //System.out.println(user1.equals(user2));
        //System.out.println(user3.equals(user4));

        User[] users = {user1, user2, user3, user4};
        System.out.println(getUserIndex(users ,user1));

        User user8 = user3;
        System.out.println(user3.equals(user8));
        System.out.println("sentence".equals(user3));
        System.out.println(user3.equals("sentence"));

        System.out.println("2)");
        System.out.println("sentence".equals(null));
        System.out.println(user1.equals(null));

        System.out.println("3)");
        System.out.println(user1.equals(user1));

        System.out.println("4)");
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user5));
        System.out.println(user1.equals(user5));


        /***
         * 1) a.equals(b) == b.equals(a)
         * 2) a.equals(null) -> false
         * 3) a.equals(a) -> true
         * 4) a.equals(b) is true, b.equals(c) is true => a.equals(c) -> true
         * 5) equals does not depends on invocation number
         */

    }

    public static int getUserIndex(User[] users, User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user)) {
                return i;
            }
        }
        return -1;
    }


}
