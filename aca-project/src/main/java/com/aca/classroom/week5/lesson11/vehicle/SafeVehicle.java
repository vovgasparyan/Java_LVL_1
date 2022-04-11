package com.aca.classroom.week5.lesson11.vehicle;

public class SafeVehicle {

    private VehicleType type;
    private int year;

    public SafeVehicle(VehicleType type, int year) {
        this.type = type;
        this.year = year;
    }

    public static void main(String[] args) {
        SafeVehicle safeVehicle1 = new SafeVehicle(VehicleType.CAR, 2022);
        SafeVehicle safeVehicle2 = new SafeVehicle(VehicleType.BUS, 2022);

        VehicleType carType = VehicleType.valueOf("CAR");

        System.out.println(carType);
    }
}
