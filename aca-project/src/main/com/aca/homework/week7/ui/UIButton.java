package com.aca.homework.week7.ui;

public class UIButton extends UIView {

    private ColorsSelector buttonColor;

    public UIButton(double width, double height, ColorsSelector buttonColor) {
        super(width, height);
        this.buttonColor = buttonColor;
    }

    @Override
    public void click() {
        System.out.print(Colors.colors(buttonColor) + "Clicked on a button having a color "
                + this.buttonColor + ", width: " + this.getWidth() + ", height: " + this.getHeight());
    }
}
