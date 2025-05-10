package com.dp.creational.absfactory;

import com.dp.creational.absfactory.car.BMW;
import com.dp.creational.absfactory.car.Car;
import com.dp.creational.absfactory.car.music.HarmanMusicSystem;
import com.dp.creational.absfactory.car.music.MusicSystem;

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
