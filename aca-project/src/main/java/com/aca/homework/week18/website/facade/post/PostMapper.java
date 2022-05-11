package com.aca.homework.week18.website.facade.post;

import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.facade.dto.PostDto;

public interface PostMapper {
    PostDto map(Post post);
}
