package com.aca.homework.week12.params;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserUpdateParamsTest {


    @Test
    public void testUpdateUserNameDefaultValue() {
        UserCreateParams user1 = new UserCreateParams("blade", "Vladimir", 40);
        Assertions.assertEquals("blade", user1.getUsername());
    }

    @Test
    public void testUpdateUserFirstName() {
        UserCreateParams user1 = new UserCreateParams("blade", "Vladimir", 40);
        UserUpdateParams userUpdateParams = new UserUpdateParams();
        userUpdateParams.add(user1);
        userUpdateParams.updateFirstName("Vladimir", "Robert");
        Assertions.assertEquals("Robert", user1.getFirstName());
    }

}