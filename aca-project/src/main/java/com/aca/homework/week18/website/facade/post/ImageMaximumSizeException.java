package com.aca.homework.week18.website.facade.post;

public class ImageMaximumSizeException extends RuntimeException {
    public ImageMaximumSizeException(int size) {
        super(String.format("The maximum upload image size must be less or equal %s", size));
    }
}
