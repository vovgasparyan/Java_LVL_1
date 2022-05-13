package com.aca.homework.week18.website.facade.user;

import com.aca.homework.week18.website.facade.request.user.UserSignUpRequestDto;
import com.aca.homework.week18.website.facade.response.user.UserSignUpResponseDto;

public interface UserFacade {
    UserSignUpResponseDto signUp(UserSignUpRequestDto dto);
}
