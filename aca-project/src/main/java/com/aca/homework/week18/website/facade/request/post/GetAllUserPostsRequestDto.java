package com.aca.homework.week18.website.facade.request.post;

public class GetAllUserPostsRequestDto {

    private Long userId;

    public GetAllUserPostsRequestDto(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}
