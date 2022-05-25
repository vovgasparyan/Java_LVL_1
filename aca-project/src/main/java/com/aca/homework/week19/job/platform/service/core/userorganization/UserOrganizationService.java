package com.aca.homework.week19.job.platform.service.core.userorganization;

import com.aca.homework.week19.job.platform.entity.userorganization.UserOrganization;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserOrganizationService {

    UserOrganization create(CreateUserOrganizationParams params);

    List<UserOrganization> findByOrganizationId(Long organizationId);
}
