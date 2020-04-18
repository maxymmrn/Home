package com.ua.mnbs.demo.models;

public class Cat extends Pet {
    private boolean gelded;

    public Cat(String name, int age) {
        this(name, age, false);
    }

    public Cat(String name, int age, boolean gelded) {
        super(name, age);
        this.gelded = gelded;
    }

    public boolean isGelded() {
        return gelded;
    }

    public void setGelded(boolean gelded) {
        this.gelded = gelded;
    }
}
