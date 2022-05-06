package com.aca.exam.exam3.repository;

import com.aca.exam.exam3.entity.Plate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlateRepository extends JpaRepository<Plate, Long> {

    @Override
    Optional<Plate> findById(Long id);

}
