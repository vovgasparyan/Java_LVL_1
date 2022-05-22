package com.aca.homework.week21.button.state;

public class Button {

    private ButtonState buttonState;

    public Button(ButtonState buttonState) {
        this.buttonState = buttonState;
    }

    public ButtonState stateSwitch() {
        setButtonState(buttonState.nextState());
        return buttonState;
    }

    public void setButtonState(ButtonState buttonState) {
        this.buttonState = buttonState;
    }

    public ButtonState getButtonState() {
        return buttonState;
    }
}
