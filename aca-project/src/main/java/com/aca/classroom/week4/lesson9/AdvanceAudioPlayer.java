package com.aca.classroom.week4.lesson9;

public class AdvanceAudioPlayer extends AudioPlayer {
                // SUB CLASS            // SUPER CLASS

    public AdvanceAudioPlayer() {
        System.out.println("AdvanceAudioPlayer");
    }

    public void pause() {
        System.out.println("Paused!");
    }

    public static void main(String[] args) {
        //AdvanceAudioPlayer advanceAudioPlayer = new AdvanceAudioPlayer();
        //advanceAudioPlayer.play();

        //advanceAudioPlayer.setPlaying(false);
        new AdvanceAudioPlayer();
    }

    @Override
    public void play() {
        super.play();
    }
}
