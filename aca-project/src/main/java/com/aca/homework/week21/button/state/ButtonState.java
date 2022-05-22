package com.aca.homework.week21.button.state;

public interface ButtonState {

    boolean isEnabled();

    ColorType color();

    ButtonState nextState();
}
