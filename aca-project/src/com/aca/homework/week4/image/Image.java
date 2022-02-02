package com.aca.homework.week4.image;

public class Image {

    private int horizonLength;
    private int verticalLength;
    private final char[][] drawObject;

    public Image(int horizonLength, int verticalLength) {
        this.horizonLength = verticalLength;
        this.verticalLength = horizonLength;
        this.drawObject = new char[this.horizonLength][this.verticalLength];
        for (int i = 0; i < this.horizonLength; i++) {
            for (int j = 0; j < this.verticalLength; j++) {
                this.drawObject[i][j] = '-';
            }
        }
    }

    public void show() {
        for (char[] chars : this.drawObject) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void draw(int i, int j) {
        if ((i > this.horizonLength - 1) || (j > this.verticalLength - 1)) {
            System.out.println("Your input values are invalid!");
        } else {
            this.drawObject[i][j] = '*';
        }

    }
}
