package com.aca.homework.week21.button.state;

import java.util.Objects;

public class ButtonOnState implements ButtonState {

    private ButtonStateType buttonStateType;

    public ButtonOnState(ButtonStateType buttonStateType) {
        this.buttonStateType = ButtonStateType.ON;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public ColorType color() {
        return ColorType.GREEN;
    }

    @Override
    public ButtonState nextState() {
        return new ButtonOffState(ButtonStateType.OFF);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ButtonOnState that = (ButtonOnState) o;
        return buttonStateType == that.buttonStateType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(buttonStateType);
    }
}
