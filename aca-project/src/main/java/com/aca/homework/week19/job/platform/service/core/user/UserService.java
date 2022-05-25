package com.aca.homework.week19.job.platform.service.core.user;

import com.aca.homework.week19.job.platform.entity.user.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface UserService {

    User create(CreateUserParams params);

    User getById(Long id);

    Optional<User> findByEmail(String email);

    List<User> getUsersByOrganization(Long organizationId);
}
