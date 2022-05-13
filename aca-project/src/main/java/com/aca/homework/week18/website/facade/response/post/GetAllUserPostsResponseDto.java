package com.aca.homework.week18.website.facade.response.post;

import com.aca.homework.week18.website.facade.dto.PostDto;
import com.aca.homework.week18.website.facade.dto.UserDto;

import java.util.List;

public class GetAllUserPostsResponseDto {

    private UserDto userDto;
    private List<PostDto> postDtoList;

    public GetAllUserPostsResponseDto(UserDto userDto, List<PostDto> postDtoList) {
        this.userDto = userDto;
        this.postDtoList = postDtoList;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public List<PostDto> getPostDtoList() {
        return postDtoList;
    }

    @Override
    public String toString() {
        return "GetAllUserPostsResponseDto{" +
                "userDto=" + userDto +
                ", postDtoList=" + postDtoList +
                '}';
    }
}
