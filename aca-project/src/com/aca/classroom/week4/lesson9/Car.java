package com.aca.classroom.week4.lesson9;

public class Car {

    private AudioPlayer audioPlayer;

    public void setAudioPlayer(AudioPlayer play) {
        this.audioPlayer = play;
    }
    public Car () {

    }
    public Car (AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void openDoors() {
        if (this.audioPlayer == null) {
            System.out.println("This car haven't AudioPlayer");
        } else {
            this.audioPlayer.play();
            this.waiting3Second();
            this.audioPlayer.stop();
        }
    }

    public void waiting3Second() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 3000) {
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(new AudioPlayer());
        Car car3 = new Car(new AudioPlayer());
    }


}
