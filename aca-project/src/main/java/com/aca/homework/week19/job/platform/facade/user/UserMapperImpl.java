package com.aca.homework.week19.job.platform.facade.user;

import com.aca.homework.week19.job.platform.entity.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDetailsDto map(User user) {
        return new UserDetailsDto(
                user.getEmail(),
                user.getFirstName(),
                user.getLastName(),
                user.getDetails(),
                user.getJobStatus(),
                user.getUserType()
        );
    }
}
