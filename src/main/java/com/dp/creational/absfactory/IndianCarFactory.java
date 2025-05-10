package com.dp.creational.absfactory;

import com.dp.creational.absfactory.car.Car;
import com.dp.creational.absfactory.car.Tata;
import com.dp.creational.absfactory.car.music.MusicSystem;
import com.dp.creational.absfactory.car.music.SonyMusicSystem;

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
