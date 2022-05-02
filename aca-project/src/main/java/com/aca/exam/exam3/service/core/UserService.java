package com.aca.exam.exam3.service.core;

import com.aca.exam.exam3.entity.User;

public interface UserService {

    User create(CreateUserParams params);

    User getById(Long id);

}
