package com.aca.homework.week4.snake;

public class SnakeGame {

    private char[][] gameBoard;
    private int snakeXMovement;
    private int snakeYMovement;
    private int appleX;
    private int appleY;
    private boolean gameIsRunning = true;


    public SnakeGame(char[][] board, int snakeDefaultX, int snakeDefaultY, int appleDefaultX, int appleDefaultY) {
        this.gameBoard = board;
        this.snakeXMovement = snakeDefaultX;
        this.snakeYMovement = snakeDefaultY;
        this.appleX = appleDefaultX;
        this.appleY = appleDefaultY;
    }

    /***
     * Program not over
     */
}
