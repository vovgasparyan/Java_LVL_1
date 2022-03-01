package com.aca.homework.week7.clickable;

import java.util.Scanner;

public class ClickableTest {

    public static void main(String[] args) {

        AbstractClickable[] abstractClickables = createClickableObjects();
        invokeClicked(abstractClickables);

    }

    public static AbstractClickable[] createClickableObjects() {
        AbstractClickable[] abstractClickable = new AbstractClickable[2];

        for (int i = 0; i < abstractClickable.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type a clickable object name.");
            String objectName = scanner.nextLine();

            if (objectName.startsWith("button")) {
                abstractClickable[i] = new Button(objectName, new Action() {
                    @Override
                    public void doAction(Clickable clickable) {
                        System.out.println("The click method is invoked on the Button object having a name " + clickable.name());
                    }
                });
            }
            if (objectName.startsWith("image")) {
                abstractClickable[i] = new Button(objectName, new Action() {
                    @Override
                    public void doAction(Clickable clickable) {
                        System.out.println("The image object created having a name " + clickable.name());
                    }
                });
            }
        }

        return abstractClickable;
    }

    public static void invokeClicked(AbstractClickable[] abstractClickable) {
        for (int i = 0; i < abstractClickable.length; i++) {
            System.out.println("Please enter a clickable name to invoke the click method.");
            Scanner scanner = new Scanner(System.in);
            String clickName = scanner.nextLine();
            for (int j = 0; j < abstractClickable.length; j++) {
                if(abstractClickable[j].name().equals(clickName)) {
                    abstractClickable[i].click();
                }
            }
        }
    }
}
