package com.aca.homework.week19.job.platform.facade.organization;

import com.aca.homework.week19.job.platform.entity.organization.Organization;
import com.aca.homework.week19.job.platform.entity.user.User;
import com.aca.homework.week19.job.platform.facade.user.UserMapper;

import java.util.List;

public interface OrganizationMapper {

    OrganizationDetailsDto map(Organization organization, List<User> users, UserMapper userMapper);
}
