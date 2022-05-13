package com.aca.homework.week18.website.facade.image;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.facade.dto.ImageDto;

public interface ImageMapper {
    ImageDto map(Image image);
}
