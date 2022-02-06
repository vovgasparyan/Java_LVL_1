package com.aca.homework.week4.snake;

public class Main {

    public static void main(String[] args) {
        char[][] gameBoard = new char[8][8];
        gameBoardFill(gameBoard);

        SnakeGame snakeGame = new SnakeGame(gameBoard, 0, 0, 2, 1);
    }

    public static void gameBoardFill(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '0';
            }
        }
    }
}
