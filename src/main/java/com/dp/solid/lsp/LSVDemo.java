package com.dp.solid.lsp;

public class LSVDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Lamborgini(4);
        vehicle.engineNoise();
        vehicle.printNumberOfWheels();

        vehicle = new RoyalEnfield(2);
        vehicle.engineNoise();
        vehicle.printNumberOfWheels();
    }
}
