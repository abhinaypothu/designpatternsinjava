package com.dp.structural.adapter;

public class MP4MediaPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
      throw new UnsupportedOperationException();
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file. Name: "+filename);
    }

    @Override
    public void playMp3(String filename) {
        throw new UnsupportedOperationException();
    }
}
