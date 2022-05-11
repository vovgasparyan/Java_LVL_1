package com.aca.homework.week18.website.facade.image;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.facade.dto.ImageDto;

public class ImageMapperImpl implements ImageMapper {
    @Override
    public ImageDto map(Image image) {
        return new ImageDto(image.getBlobId());
    }
}
