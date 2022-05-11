package com.aca.homework.week18.website.facade.dto;

public class ImageDto {

    private String blobId;

    public ImageDto(String blobId) {
        this.blobId = blobId;
    }

    public String getBlobId() {
        return blobId;
    }


    @Override
    public String toString() {
        return "ImageDto{" +
                ", blobId='" + blobId +
                '}';
    }
}
