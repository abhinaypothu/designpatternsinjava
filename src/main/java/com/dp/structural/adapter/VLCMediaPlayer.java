package com.dp.structural.adapter;

public class VLCMediaPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name: "+filename);
    }

    @Override
    public void playMp4(String filename) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void playMp3(String filename) {
        throw new UnsupportedOperationException();
    }
}
