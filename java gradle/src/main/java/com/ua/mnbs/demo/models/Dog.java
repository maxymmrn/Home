package com.ua.mnbs.demo.models;

public class Dog extends Pet {
    private String breed;
    private boolean trained;

    public Dog(String name, int age) {
        this(name, age, null, false);
    }

    public Dog(String name, int age, String breed, boolean trained) {
        super(name, age);
        this.breed = breed;
        this.trained = trained;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
}
