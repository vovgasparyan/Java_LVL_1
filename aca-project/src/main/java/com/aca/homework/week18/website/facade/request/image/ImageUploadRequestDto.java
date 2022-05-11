package com.aca.homework.week18.website.facade.request.image;

public class ImageUploadRequestDto {

    private String blobId;
    private Long postId;

    public ImageUploadRequestDto(String blobId, Long postId) {
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
        return "ImageUploadRequestDto{" +
                "blobId='" + blobId + '\'' +
                ", postId=" + postId +
                '}';
    }
}
