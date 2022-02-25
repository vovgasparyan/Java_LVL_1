package com.aca.homework.week7.button.click;

public class Button implements Action {

    private String text;
    private Action action;

    public Button(String text, Action action) {
        this.text = text;
        this.action = action;
    }

    public void click() {
        System.out.println("Clicked on the button");
    }

    public String getText() {
        return text;
    }

    @Override
    public void doAction() {
        System.out.println("Text from constructor is: " + getText());
        this.click();
    }


}
