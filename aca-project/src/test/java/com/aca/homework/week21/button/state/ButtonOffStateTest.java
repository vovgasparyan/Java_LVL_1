package com.aca.homework.week21.button.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButtonOffStateTest {

    private ButtonState buttonState;

    @BeforeEach
    public void init() {
        buttonState = new ButtonOffState(ButtonStateType.OFF);
    }

    @Test
    public void testGetColor() {
        Assertions.assertThat(buttonState.color()).isEqualTo(ColorType.GRAY);
    }

    @Test
    public void testIsEnabled() {
        Assertions.assertThat(buttonState.isEnabled()).isFalse();
    }

    @Test
    public void testChangeState() {
        Assertions.assertThat(buttonState.nextState()).isEqualTo(new ButtonOnState(ButtonStateType.ON));
    }


}