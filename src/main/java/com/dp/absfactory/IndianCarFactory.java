package com.dp.absfactory;

import com.dp.absfactory.car.Car;
import com.dp.absfactory.car.Tata;
import com.dp.absfactory.car.music.MusicSystem;
import com.dp.absfactory.car.music.SonyMusicSystem;

public class IndianCarFactory implements CompleteCarFactory{
    @Override
    public Car createCar() {
        return new Tata();
    }

    @Override
    public MusicSystem createMusicSystem() {
        return new SonyMusicSystem();
    }

}
