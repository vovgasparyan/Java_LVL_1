package com.aca.homework.week18.website.service.core.post;

import java.util.Objects;

public class CreatePostParams {

    private String title;
    private String description;
    private Long user_id;

    public CreatePostParams(String title, String description, Long user_id) {
        this.title = title;
        this.description = description;
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getUser_id() {
        return user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatePostParams that = (CreatePostParams) o;
        return Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(user_id, that.user_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, user_id);
    }

    @Override
    public String toString() {
        return "CreatePostParams{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
