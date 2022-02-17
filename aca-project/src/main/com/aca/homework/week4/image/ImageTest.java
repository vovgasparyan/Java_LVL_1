package com.aca.homework.week4.image;

public class ImageTest {

    public static void main(String[] args) {

        Image image = new Image(5, 10);
        image.show();

        image.draw(0, 2);
        image.draw(1, 1);
        image.draw(1, 2);
        image.draw(2, 0);
        image.draw(2, 2);
        image.draw(3, 2);
        image.draw(4, 2);
        image.draw(5, 2);
        image.draw(6, 2);
        image.draw(7, 2);
        image.draw(8, 2);
        image.draw(9, 0);
        image.draw(9, 1);
        image.draw(9, 2);
        image.draw(9, 3);
        image.draw(9, 4);
        image.show();
    }
}
