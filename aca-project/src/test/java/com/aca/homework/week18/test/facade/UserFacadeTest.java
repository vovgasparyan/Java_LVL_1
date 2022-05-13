package com.aca.homework.week18.test.facade;

import com.aca.homework.week18.test.entity.User;
import com.aca.homework.week18.test.facade.request.UserSignUpRequestDto;
import com.aca.homework.week18.test.facade.response.UserSignUpResponseDto;
import com.aca.homework.week18.test.service.core.CreateUserParams;
import com.aca.homework.week18.test.service.core.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserFacadeTest {

    private UserFacade userFacade;

    @Mock
    private UserService userService;

    @BeforeEach
    public void setUp() {
        userFacade = new UserFacadeImpl(userService);
    }

    @Test
    public void testSignUpFirstTime() {
        Mockito.when(userService.create(new CreateUserParams(
                "vladimir_gasparyan",
                "200382",
                "Vladimir",
                "Gasparyan"
        ))).thenReturn(new User(
                "vladimir_gasparyan",
                "200382",
                "Vladimir",
                "Gasparyan")
        );
        UserSignUpResponseDto signUpResponseDto = userFacade.signUp(new UserSignUpRequestDto(
                        "vladimir_gasparyan",
                        "200382",
                        "Vladimir",
                        "Gasparyan"
                )
        );

        Assertions.assertThat(signUpResponseDto.getUsername()).isEqualTo("vladimir_gasparyan");
    }

}