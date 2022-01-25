package com.aca.classroom.week3.lesson6.game;

public class GameTest {

    public static void main(String[] args) {

        Game game1 = new Game();
        game1.name = "game 1";
        Game game2 = new Game();
        game2.name = "game 2";

        Game[] gameArray = new Game[2];
        gameArray[0] = game1;
        gameArray[1] = game2;

        Player player1 = new Player();
        player1.username = "aca";
        player1.games = new Game[]{game1, game2};

        //player1.print();

        System.out.println(player1.getPrintString());

    }


}
