package com.aca.exam.exam3.repository;

import com.aca.exam.exam3.entity.UserPlateNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPlateNumberRepository extends JpaRepository<UserPlateNumber, Long> {
}
