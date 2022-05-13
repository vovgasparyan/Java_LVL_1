package com.aca.homework.week18.website.repository;

import com.aca.homework.week18.website.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

    @Override
    Optional<Image> findById(Long aLong);

    List<Image> findAllByPostId(Long id);
}
