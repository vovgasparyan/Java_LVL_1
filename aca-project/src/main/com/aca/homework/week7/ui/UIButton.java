package com.aca.homework.week7.ui;

public class UIButton extends UIView {

    private Colors buttonColor;

    public UIButton(double width, double height, Colors buttonColor) {
        super(width, height);
        this.buttonColor = buttonColor;
    }

    @Override
    public void click() {
        System.out.print(this.colors(buttonColor) + "Clicked on a button having a color " + this.buttonColor + ", ");
        super.click();
    }
}
