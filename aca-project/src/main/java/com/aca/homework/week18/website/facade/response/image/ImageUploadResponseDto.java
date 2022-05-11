package com.aca.homework.week18.website.facade.response.image;

public class ImageUploadResponseDto {

    private String blobId;
    private Long postId;

    public ImageUploadResponseDto(String blobId, Long postId) {
        this.blobId = blobId;
        this.postId = postId;
    }

    public String getBlobId() {
        return blobId;
    }

    public Long getPostId() {
        return postId;
    }

    @Override
    public String toString() {
        return "ImageUploadResponseDto{" +
                "blobId='" + blobId + '\'' +
                ", postId=" + postId +
                '}';
    }
}
