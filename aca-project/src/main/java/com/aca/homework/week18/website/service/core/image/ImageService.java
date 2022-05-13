package com.aca.homework.week18.website.service.core.image;

import com.aca.homework.week18.website.entity.Image;

import java.util.List;

public interface ImageService {

    Image create(CreateImageParams params);

    List<Image> getByUserId(Long id);

    List<Image> getByPostId(Long id);
}
