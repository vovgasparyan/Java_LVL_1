package com.aca.homework.week18.website.service.core.post;

import io.jsonwebtoken.lang.Assert;

import java.util.Objects;

public class CreatePostParams {

    private String title;
    private String description;
    private Long userId;

    public CreatePostParams(String title, String description, Long userId) {
        Assert.hasText(title, "The title field must have text");
        Assert.hasText(description, "The description field must have text");
        Assert.notNull(userId, "The userId value should not be null");
        this.title = title;
        this.description = description;
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatePostParams that = (CreatePostParams) o;
        return Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, userId);
    }

    @Override
    public String toString() {
        return "CreatePostParams{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user_id=" + userId +
                '}';
    }
}
