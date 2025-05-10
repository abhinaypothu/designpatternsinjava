package com.dp.factory;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Client client = new Client();
        client.setupVehicle(VehicleTypes.CAR);
        client.printVehicle();

        client.setupVehicle(VehicleTypes.BIKE);
        client.printVehicle();

        client.setupVehicle(VehicleTypes.LORRY);
        client.printVehicle();
    }
}
