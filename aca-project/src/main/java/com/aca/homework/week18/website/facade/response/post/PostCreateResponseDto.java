package com.aca.homework.week18.website.facade.response.post;

import com.aca.homework.week18.website.facade.response.image.ImageUploadResponseDto;

import java.util.List;

public class PostCreateResponseDto {

    private List<ImageUploadResponseDto> imageUploadResponseDtos;
    private String title;
    private String description;

    public PostCreateResponseDto(List<ImageUploadResponseDto> imageUploadResponseDtos, String title, String description) {
        this.imageUploadResponseDtos = imageUploadResponseDtos;
        this.title = title;
        this.description = description;
    }

    public List<ImageUploadResponseDto> getImageUploadResponseDtos() {
        return imageUploadResponseDtos;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "PostCreateResponseDto{" +
                "imageUploadResponseDtos=" + imageUploadResponseDtos +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
