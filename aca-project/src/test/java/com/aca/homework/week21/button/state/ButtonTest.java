package com.aca.homework.week21.button.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ButtonTest {

    private final Button button = new Button(new ButtonOnState(ButtonStateType.ON));

    @Test
    public void testStateSwitch() {
        button.stateSwitch();
        Assertions.assertThat(button.getButtonState()).isEqualTo(new ButtonOffState(ButtonStateType.OFF));
    }

}