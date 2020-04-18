package com.ua.mnbs.demo.models;

import com.ua.mnbs.demo.enums.Color;
import com.ua.mnbs.demo.enums.Gender;

public class Human {
    private String name;
    private Color hairColor;
    private Gender gender;

    public Human(String name, Gender gender) {
        this(name, null, gender);
    }

    public Human(String name, Color hairColor, Gender gender) {
        this.name = name;
        this.hairColor = hairColor;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
