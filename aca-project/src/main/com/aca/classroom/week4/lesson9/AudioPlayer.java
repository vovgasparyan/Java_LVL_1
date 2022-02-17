package com.aca.classroom.week4.lesson9;

public class AudioPlayer {

    private boolean isPlaying;

    public AudioPlayer() {
        System.out.println("AudioPlayer");
    }

    public void play() {
        isPlaying = true;
        System.out.println("Playing ...");
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Stopped!");
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}
