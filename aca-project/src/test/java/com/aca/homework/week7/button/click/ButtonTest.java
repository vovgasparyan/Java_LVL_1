package com.aca.homework.week7.button.click;

public class ButtonTest {

    public static void main(String[] args) {

        Action action1 = new Action() {
            @Override
            public void doAction() {
                System.out.println("Clicked on the button.\nText from anonymous Action object");
            }
        };

        action1.doAction();

        Button button1 = new Button("Some text", action1);
        button1.click();

    }
}
