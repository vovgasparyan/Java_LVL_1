package com.aca.homework.week18.website.facade.dto;

import java.util.List;

public class PostDto {

    private Long postId;
    private String title;
    private String description;

    private UserDto userDto;
    private List<ImageDto> imageDtos;

    public PostDto(Long postId, String title, String description, UserDto userDto, List<ImageDto> imageDtos) {
        this.postId = postId;
        this.title = title;
        this.description = description;
        this.userDto = userDto;
        this.imageDtos = imageDtos;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public List<ImageDto> getImageDtos() {
        return imageDtos;
    }

    public void setImageDtos(List<ImageDto> imageDtos) {
        this.imageDtos = imageDtos;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", userDto=" + userDto +
                ", imageDtos=" + imageDtos +
                '}';
    }
}
