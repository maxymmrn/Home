package com.ua.mnbs.demo.models;

import com.ua.mnbs.demo.enums.Color;

import java.util.LinkedList;
import java.util.List;

public class Home {
    private int floorNumber;
    private Color color;
    private boolean hasGarage;
    private String address;
    private List<Human> owners;
    private List<Pet> pets;

    public Home() {
        this(0, null);
    }

    public Home(int floorNumber, String address) {
        this(floorNumber, null, false,
                address, new LinkedList<>(), new LinkedList<>());
    }

    public Home(int floorNumber, Color color, boolean hasGarage,
                String address, List<Human> owners, List<Pet> pets) {
        this.floorNumber = floorNumber;
        this.color = color;
        this.hasGarage = hasGarage;
        this.address = address;
        this.owners = owners;
        this.pets = pets;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Human> getOwners() {
        return owners;
    }

    public void setOwners(List<Human> owners) {
        this.owners = owners;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
