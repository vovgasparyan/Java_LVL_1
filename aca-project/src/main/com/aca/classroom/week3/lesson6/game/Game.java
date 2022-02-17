package com.aca.classroom.week3.lesson6.game;

public class Game {

    static long shootCountOfClass;

    String name;
    long shootCount;

    static int allFires = 0;

    public static void main(String[] args) {
        shootCountOfClass++;
        shootCountOfClass++;
        shootCountOfClass++;
        shootCountOfClass++;

/*
        Game game1 = new Game();
        game1.name = "game 1";
        game1.shootCount++;
        game1.shootCount++;
        game1.shootCount++;

        Game game2 = new Game();
        game2.name = "game 2";
        game2.shootCount++;

        Game game3 = new Game();
        game3.name = "game 3";
   */
        /*

        printShootCount(game1);
        game1.printShootCountForObject();
        printShootCount(game2);
        game2.printShootCountForObject();
        printShootCount(game3);
        game3.printShootCountForObject();
*/



        Game game1 = new Game();
        game1.name = "game 1";

        Game game2 = new Game();
        game2.name = "game 2";

        for (int i = 0; i < 5; i++) {
            game1.fire();
        }
        for (int i = 0; i < 125; i++) {
            game2.fire();
        }

        System.out.println("All fire count is: " + allFires);

        game1.print();
        game2.print();

        printStatic(game1);
        printStatic(game2);

    }

    public static void printShootCount(Game game) {
        System.out.println(game.shootCount);
    }

    public static void printShootCountForClass(Game game) {
        System.out.println(shootCountOfClass + game.shootCount);
    }

    public void printShootCountForObject() {
        System.out.println(shootCount);
    }

    public void fire() {
        allFires++;
        shootCount++;
        System.out.println(name + " Fire");
    }

    public void print() {
        System.out.println(getPrintString());

    }

    public String getPrintString() {
        return "name: " + name;
    }

    public static void printStatic(Game game) {
        System.out.println(game.name + " " + game.shootCount);
    }


}
