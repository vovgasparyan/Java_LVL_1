package com.aca.homework.week7.clickable;

public abstract class AbstractClickable implements Clickable {

    private String name;
    private Action action;

    public AbstractClickable (String name, Action action) {
        this.name = name;
        this.action = action;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void click() {
        action.doAction(this);
    }
}
