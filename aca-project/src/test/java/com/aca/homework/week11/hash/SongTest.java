package com.aca.homework.week11.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SongTest {

    @Test
    public void test2EqualObjectsHaveSameHashCodes() {
        Song song1 = new Song(new Singer("Celine", "Dion"), "My Heart Will Go On", 4000, 9.8f);
        Song song2 = new Song(new Singer("Celine", "Dion"), "My Heart Will Go On", 4000, 9.8f);
        Assertions.assertEquals(song1, song2);
        Assertions.assertEquals(song1.hashCode(), song2.hashCode());
    }

    @Test
    public void test2DiffObjectsHaveDiffHashCodes() {
        Song song1 = new Song(new Singer("Celine", "Dion"), "My Heart Will Go On", 4000, 9.8f);
        Song song2 = new Song(new Singer("Michael", "Jackson"), "Thriller", 6000, 9.9f);
        Assertions.assertNotEquals(song1, song2);
        Assertions.assertNotEquals(song1.hashCode(), song2.hashCode());
    }
}