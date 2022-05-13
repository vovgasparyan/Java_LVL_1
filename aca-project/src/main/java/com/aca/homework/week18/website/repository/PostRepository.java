package com.aca.homework.week18.website.repository;

import com.aca.homework.week18.website.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Override
    List<Post> findAll();

    List<Post> findAllByUserId(Long id);

    @Override
    Optional<Post> findById(Long aLong);
}
