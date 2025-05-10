package com.dp.creational.factory;

class Client {
    Client(){
        this.setupVehicle(null);
    }
    Vehicle vehicle;
    public void setupVehicle(VehicleTypes type)
    {
        if(type == null)
            return;
        switch (type) {
            case LORRY:
                vehicle = new Lorry();
                break;
            case BIKE:
                vehicle = new Bike();
                break;
            case CAR:
                vehicle = new Car();
                break;
            default:
                vehicle = null;
        }
    }
    public void printVehicle()
    {
        vehicle.print();
    }
}
