package Homework_02_03_26;

public class Car {
    private String mark;
    private int maxKmEngine = 150000;
    private int maxKmGearBox = 170000;
    private int startKmOfEngine;
    private int startKmOfGearbox;

    public Car() {
        this.startKmOfEngine = 0;
        this.startKmOfGearbox = 0;
    }
    public int drive(){
        int driveKm = ((int)Math.random() * 110000) + 1;
        startKmOfEngine += driveKm;
        startKmOfGearbox += driveKm;
        return driveKm;
    }
    public void checkKm() {
        if (startKmOfEngine >= maxKmEngine && startKmOfGearbox >= maxKmGearBox) {
            startKmOfEngine = 0;
            startKmOfGearbox = 0;
        } else {
            System.out.println("Subject To Driving");

        }
    }
    public int getStartKmOfEngine() {
        return startKmOfEngine;
    }

    public int getStartKmOfGearbox() {
        return startKmOfGearbox;
    }
}