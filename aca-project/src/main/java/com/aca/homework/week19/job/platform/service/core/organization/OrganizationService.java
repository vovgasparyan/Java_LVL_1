package com.aca.homework.week19.job.platform.service.core.organization;

import com.aca.homework.week19.job.platform.entity.organization.Organization;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface OrganizationService {

    Organization create(CreateOrganizationParams params);

    Organization getById(Long id);

    Optional<Organization> findByName(String name);
}
