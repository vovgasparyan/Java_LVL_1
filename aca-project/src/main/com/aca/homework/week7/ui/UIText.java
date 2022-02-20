package com.aca.homework.week7.ui;

public class UIText extends UIView {

    private String textValue;
    private ColorsSelector textColor;

    public UIText(double width, double height, String textValue, ColorsSelector textColor) {
        super(width, height);
        this.textValue = textValue;
        this.textColor = textColor;
    }

    @Override
    public void click() {
        System.out.print(Colors.colors(textColor) +"Clicked on a text "
                + this.textValue + " having a color " + this.textColor + ", width: "
                + this.getWidth() + ", height: " + this.getHeight());

    }
}
