package com.aca.homework.week4.snake;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[][] gameBoard = new char[8][8];
        gameBoardFill(gameBoard);

        SnakeGame snakeGame = new SnakeGame(gameBoard, 0, 0, 2, 1);
        snakeGame.start();
    }

    public static void gameBoardFill(char[][] board) {
        for (char[] chars : board) {
            Arrays.fill(chars, '0');
        }
    }
}
