package com.aca.classroom.week3.lesson6.game;

public class Player {

    String username;
    Game[] games;

    public void print() {
        System.out.println("username: " + username);
        for (int i = 0; i < games.length; i++) {
            System.out.println("game " + i);
            games[i].print();
        }
    }

    public String getPrintString() {
        String str = "";

        str = ("username: " + username);
        for (int i = 0; i < games.length; i++) {
            str += ("game " + i);
            str += games[i].getPrintString();
        }
        return str;
    }


}
