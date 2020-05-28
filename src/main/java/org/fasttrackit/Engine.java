package org.fasttrackit;

public class Engine {

    public Engine(String make,String fuelType,double capacity){
        this.make = make;
        this.fuelType = fuelType;
        this.capacity = capacity;
    }

    private String make;
    private String fuelType;
    private double capacity;
    private int horsePower;

    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return this.make;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public String getFuelType(){
        return this.fuelType;
    }
    public void setCapacity(double capacity){
        this.capacity = capacity;
    }
    public double getCapacity(){
        return this.capacity;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }
    public int getHorsePower(){
        return this.horsePower;
    }

}
