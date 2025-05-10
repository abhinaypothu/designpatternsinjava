package com.dp.creational.absfactory;

import com.dp.creational.absfactory.car.Car;
import com.dp.creational.absfactory.car.music.MusicSystem;

public class AbstractFactoryInterface {
    public static void main(String[] args) {
        CompleteCarFactory carFactory = CompleteCarFactory.getFactory(CarType.INDIAN);
        Car tata = carFactory.createCar();
        tata.start();
        tata.run();
        tata.stop();

        MusicSystem sony = carFactory.createMusicSystem();
        sony.playMusic();
        sony.stopMusic();
        sony.pauseMusic();

        carFactory = CompleteCarFactory.getFactory(CarType.AMERICAN);
        Car bmw = carFactory.createCar();
        bmw.start();
        bmw.run();
        bmw.stop();

        MusicSystem harman = carFactory.createMusicSystem();
        harman.playMusic();
        harman.stopMusic();
        harman.pauseMusic();
    }
}
