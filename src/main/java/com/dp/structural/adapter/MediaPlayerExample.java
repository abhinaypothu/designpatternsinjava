package com.dp.structural.adapter;

public class MediaPlayerExample {
    public static void main(String[] args) throws Exception{
        MediaAdapter ma = new MediaAdapter();
        ma.play("over the origin.mp4");
        ma.play("over the origin.vlc");
        ma.play("over the origin.mp3");
//        ma.play("over the origin.avi");

    }
}
