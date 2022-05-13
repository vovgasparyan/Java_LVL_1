package com.aca.homework.week18.website.facade.user;

import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.facade.dto.UserDto;

public interface UserMapper {
    UserDto map(User user);
}
