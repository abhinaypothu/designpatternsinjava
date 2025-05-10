package com.dp.absfactory;

import com.dp.absfactory.car.BMW;
import com.dp.absfactory.car.Car;
import com.dp.absfactory.car.music.HarmanMusicSystem;
import com.dp.absfactory.car.music.MusicSystem;

public class AmericanCarFactory implements CompleteCarFactory{
    @Override
    public Car createCar() {
        return new BMW();
    }

    @Override
    public MusicSystem createMusicSystem() {
        return new HarmanMusicSystem();
    }
}
