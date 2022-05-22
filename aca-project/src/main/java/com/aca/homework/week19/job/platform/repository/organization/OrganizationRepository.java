package com.aca.homework.week19.job.platform.repository.organization;

import com.aca.homework.week19.job.platform.entity.organization.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    @Override
    Optional<Organization> findById(Long aLong);

    Optional<Organization> findByName(String name);
}
