package com.aca.homework.week21.button.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ButtonOnStateTest {

    private ButtonState buttonState;

    @BeforeEach
    public void init() {
        buttonState = new ButtonOnState(ButtonStateType.ON);
    }

    @Test
    public void testGetColor() {
        Assertions.assertThat(buttonState.color()).isEqualTo(ColorType.GREEN);
    }

    @Test
    public void testIsEnabled() {
        Assertions.assertThat(buttonState.isEnabled()).isTrue();
    }

    @Test
    public void testChangeState() {
        Assertions.assertThat(buttonState.nextState()).isEqualTo(new ButtonOffState(ButtonStateType.OFF));
    }

}