package com.dp.creational.absfactory.car.music;

public class HarmanMusicSystem implements MusicSystem{
    @Override
    public void playMusic() {
        System.out.println("Harman Music playing");
    }

    @Override
    public void stopMusic() {
        System.out.println("Harman Music stopped");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Harman Music paused");
    }
}
