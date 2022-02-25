package com.aca.homework.week7.button.click;

public class ButtonTest {

    public static void main(String[] args) {

        Action action1 = new Action() {
            @Override
            public void doAction() {
                System.out.println("Text from anonymous Action object");
            }
        };

        Action action2 = new Button("Simple text", action1);

        action1.doAction();
        action2.doAction();
    }
}
