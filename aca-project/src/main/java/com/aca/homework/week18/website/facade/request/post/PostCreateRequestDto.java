package com.aca.homework.week18.website.facade.request.post;

import com.aca.homework.week18.website.facade.request.image.ImageUploadRequestDto;

import java.util.List;

public class PostCreateRequestDto {

    private String title;
    private String description;
    private Long userId;
    private List<ImageUploadRequestDto> imageUploadRequestDtos;

    public PostCreateRequestDto(String title, String description, Long userId, List<ImageUploadRequestDto> imageUploadRequestDtos) {
        this.title = title;
        this.description = description;
        this.userId = userId;
        this.imageUploadRequestDtos = imageUploadRequestDtos;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getUserId() {
        return userId;
    }

    public List<ImageUploadRequestDto> getImageUploadRequestDtos() {
        return imageUploadRequestDtos;
    }

    @Override
    public String toString() {
        return "PostCreateRequestDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                ", imageUploadRequestDtos=" + imageUploadRequestDtos +
                '}';
    }
}
