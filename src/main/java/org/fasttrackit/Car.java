package org.fasttrackit;

public class Car {

    public Car( Engine carEngine,String make,String model,String color){
        this.carEngine = carEngine;
        this.make = make;
        this.model = model;
        this.color = color;
    }


    Engine carEngine;

    private String make;
    private String model;
    private String color;
    private int doorCount;
    private int maximSpeed;
    private double mediumComsumption;
    private double fuelTankCapacity;
    private double totalTraveledDistance;

    public void setCarEngine(Engine carEngine){
        this.carEngine = carEngine;
    }
    public Engine getCarEngine(){
        return this.carEngine;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return this.make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setDoorCount(int doorCount){
        this.doorCount = doorCount;
    }
    public int getDoorCount(){
        return this.doorCount;
    }
    public void setMaximSpeed(int maximSpeed){
        this.maximSpeed = maximSpeed;
    }
    public int getMaximSpeed(int maximSpeed){
        return this.maximSpeed;
    }
    public void setMediumComsumption(double mediumComsumption){
        this.mediumComsumption = mediumComsumption;
    }
    public double getMediumComsumption(){
        return this.mediumComsumption;
    }
    public void setFuelTankCapacity(double fuelTankCapacity){
        this.fuelTankCapacity = fuelTankCapacity;
    }
    public double getFuelTankCapacity(){
        return this.fuelTankCapacity;
    }
    public void setTotalTraveledDistance(double totalTraveledDistance){
        this.totalTraveledDistance = totalTraveledDistance;
    }
    public double getTotalTraveledDistance(){
        return this.totalTraveledDistance;
    }

}
