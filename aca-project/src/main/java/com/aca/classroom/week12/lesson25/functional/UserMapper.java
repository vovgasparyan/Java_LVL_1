package com.aca.classroom.week12.lesson25.functional;

import com.aca.classroom.week7.lesson14.anonymous.User;
import com.aca.classroom.week7.lesson14.anonymous.UserImpl;

import java.util.function.Function;

public interface UserMapper extends Function<User, UserImpl> {

    public static void main(String[] args) {
        UserMapper userMapper = null;
        UserImpl apply = userMapper.apply(new User() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public int getAge() {
                return 0;
            }
        });
    }
}
