package com.aca.homework.week4.snake;

import java.util.Scanner;

public class SnakeGame {

    private char[][] gameBoard;
    private char[][] snake;
    private char[][] apple;
    private char[][] last;
    private int snakeXMov;
    private int snakeYMov;
    private int appleX;
    private int appleY;
    private boolean gameIsRunning = true;


    public SnakeGame(char[][] board, int snakeDefaultX, int snakeDefaultY, int appleDefaultX, int appleDefaultY) {
        this.gameBoard = board;
        this.snakeXMov = snakeDefaultX;
        this.snakeYMov = snakeDefaultY;
        this.appleX = appleDefaultX;
        this.appleY = appleDefaultY;
        this.show();
    }

    public void start() {
        while(gameIsRunning) {

            this.snakeStep();

        }
    }

    public void show() {
        this.snake = this.gameBoard;
        this.last = this.gameBoard;
        this.snake[this.snakeXMov][this.snakeYMov] = '*';
        this.last[this.snakeXMov][this.snakeYMov] = '*';
        this.apple = this.gameBoard;
        this.apple[appleX][appleY] = '#';
        for (char[] chars : this.gameBoard) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    public void snakeStep() {
        this.snake = this.gameBoard;
        this.last = this.gameBoard;
        Scanner scanner = new Scanner(System.in);
        String step = scanner.next();

        switch (step) {
            case "s" :
                this.snakeXMov++;
                this.isOutOfBoard();
                this.snake[this.snakeXMov][this.snakeYMov] = '*';
                this.last[this.snakeXMov - 1][this.snakeYMov] = '0';

                break;
            case "d" :
                this.snakeYMov++;
                this.isOutOfBoard();
                this.snake[this.snakeXMov][this.snakeYMov] = '*';
                this.last[this.snakeXMov][this.snakeYMov - 1] = '0';
                break;
            case "w" :
                this.snakeXMov--;
                this.isOutOfBoard();
                this.snake[this.snakeXMov][this.snakeYMov] = '*';
                this.last[this.snakeXMov + 1][this.snakeYMov] = '0';
                break;
            case "a" :
                this.snakeYMov--;
                this.isOutOfBoard();
                this.snake[this.snakeXMov][this.snakeYMov] = '*';
                this.last[this.snakeXMov][this.snakeYMov + 1] = '0';
                break;
            default:
                System.out.println("Invalid move, press 's' for down, 'a' for left, 'w' for up, 'd' for right");
        }


        this.show();
    }

    public void isOutOfBoard() {
        if (this.snakeXMov < 0 || this.snakeXMov >= this.gameBoard.length || this.snakeYMov < 0 || this.snakeYMov >= this.gameBoard.length) {
            System.out.println("You lose");
            System.exit(0);
        }
    }

    /***
     * commit message: The solution of snake game
     * Program not over
     */
}
