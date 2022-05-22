package com.aca.homework.week19.job.platform.facade.organization;

import com.aca.homework.week19.job.platform.entity.organization.Organization;
import com.aca.homework.week19.job.platform.entity.user.User;
import com.aca.homework.week19.job.platform.facade.user.UserDetailsDto;
import com.aca.homework.week19.job.platform.facade.user.UserMapper;

import java.util.LinkedList;
import java.util.List;

public class OrganizationMapperImpl implements OrganizationMapper {

    @Override
    public OrganizationDetailsDto map(Organization organization, List<User> users, UserMapper userMapper) {
        List<UserDetailsDto> userDetailsDtos = new LinkedList<>();
        for(User user : users) {
            userDetailsDtos.add(userMapper.map(user));
        }
        return new OrganizationDetailsDto(organization.getName(), userDetailsDtos);
    }
}
