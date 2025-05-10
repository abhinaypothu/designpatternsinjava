package com.dp.absfactory;

import com.dp.absfactory.car.music.MusicSystem;
import com.dp.absfactory.car.Car;

public interface CompleteCarFactory {
    Car createCar();
    MusicSystem createMusicSystem();
    static CompleteCarFactory getFactory(CarType type){
        return switch (type){
            case INDIAN ->  new IndianCarFactory();
            case AMERICAN -> new AmericanCarFactory();
        };
    }
}
