package org.fasttrackit;

public class Track {

    public Track(String name,String country,String location,int length){
        this.name = name;
        this.country = country;
        this.location = location;
        this.length = length;
    }

    private String name;
    private String country;
    private String location;
    private int length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
