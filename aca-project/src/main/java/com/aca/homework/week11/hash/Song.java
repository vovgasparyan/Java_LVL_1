package com.aca.homework.week11.hash;

import java.util.Objects;

public class Song {

    private final Singer singer;
    private final String name;
    private final long duration;
    private final float rating;

    public Song(Singer singer, String name, long duration, float rating) {
        this.singer = singer;
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;

        Song song = (Song) o;

        if (duration != song.duration) return false;
        if (Float.compare(song.rating, rating) != 0) return false;
        if (!Objects.equals(singer, song.singer)) return false;
        return Objects.equals(name, song.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singer, name, duration, rating);
    }
}
