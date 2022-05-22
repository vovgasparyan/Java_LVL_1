package com.aca.homework.week19.job.platform.facade.user;

import com.aca.homework.week19.job.platform.entity.user.User;

public interface UserMapper {

    UserDetailsDto map(User user);
}
