package com.aca.homework.week19.job.platform.repository.userorganization;

import com.aca.homework.week19.job.platform.entity.userorganization.UserOrganization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserOrganizationRepository extends JpaRepository<UserOrganization, Long> {

    List<UserOrganization> findByOrganizationId(Long organizationId);
}
