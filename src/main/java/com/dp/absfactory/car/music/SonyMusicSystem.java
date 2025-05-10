package com.dp.absfactory.car.music;

public class SonyMusicSystem implements MusicSystem{
    @Override
    public void playMusic() {
        System.out.println("Sony Music System playing");
    }

    @Override
    public void stopMusic() {
        System.out.println("Sony Music System stopped");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Sony Music System paused");
    }
}
