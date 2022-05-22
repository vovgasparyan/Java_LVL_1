package com.aca.homework.week21.button.state;

import java.util.Objects;

public class ButtonOffState implements ButtonState {

    private ButtonStateType buttonStateType;

    public ButtonOffState(ButtonStateType buttonStateType) {
        this.buttonStateType = ButtonStateType.OFF;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public ColorType color() {
        return ColorType.GRAY;
    }

    @Override
    public ButtonState nextState() {
        return new ButtonOnState(ButtonStateType.ON);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ButtonOffState that = (ButtonOffState) o;
        return buttonStateType == that.buttonStateType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(buttonStateType);
    }
}
