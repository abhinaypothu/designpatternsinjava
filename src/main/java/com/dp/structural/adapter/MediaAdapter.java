package com.dp.structural.adapter;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaTypes getMediaType(String filename){
        if(filename.endsWith("mp4"))return MediaTypes.MP4;
        if(filename.endsWith("vlc"))return MediaTypes.VLC;
        if(filename.endsWith("mp3"))return MediaTypes.MP3;
        return null;
    }
    @Override
    public void play(String filename) {
        MediaTypes mediaType = getMediaType(filename);
        advancedMediaPlayer = switch (mediaType)
        {
            case MP4 -> new MP4MediaPlayer();
            case VLC -> new VLCMediaPlayer();
            case MP3 -> new MP3MediaPlayer();
            default -> null;
        };
        switch (mediaType)
        {
            case MP4 -> advancedMediaPlayer.playMp4(filename);
            case VLC -> advancedMediaPlayer.playVlc(filename);
            case MP3 -> advancedMediaPlayer.playMp3(filename);
        }
    }
}
