package com.aca.homework.week18.website.facade.post;

import com.aca.homework.week18.website.facade.request.image.ImageUploadRequestDto;
import com.aca.homework.week18.website.facade.request.post.GetAllUserPostsRequestDto;
import com.aca.homework.week18.website.facade.request.post.PostCreateRequestDto;
import com.aca.homework.week18.website.facade.response.image.ImageUploadResponseDto;
import com.aca.homework.week18.website.facade.response.post.GetAllUserPostsResponseDto;
import com.aca.homework.week18.website.facade.response.post.PostCreateResponseDto;

public interface PostFacade {

    PostCreateResponseDto create(PostCreateRequestDto dto);

    ImageUploadResponseDto imageUpload(ImageUploadRequestDto dto);

    GetAllUserPostsResponseDto getAllUserPosts(GetAllUserPostsRequestDto dto);
}
