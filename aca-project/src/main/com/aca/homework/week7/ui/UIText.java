package com.aca.homework.week7.ui;

public class UIText extends UIView {

    private String textValue;
    private Colors textColor;

    public UIText(double width, double height, String textValue, Colors textColor) {
        super(width, height);
        this.textValue = textValue;
        this.textColor = textColor;
    }

    @Override
    public void click() {
        System.out.print(this.colors(textColor) +"Clicked on a text "
                + this.textValue + " having a color " + this.textColor + ", ");
        super.click();
    }
}
