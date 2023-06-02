package com.rpg_project;

public class Character {
    private String name;
    private int strength;
    private int dexterity;

    // instance methods
    public Character(String name) {
        this.name = name;
    }

    // getters and setters
    public String getName() {
        return name;
    }



    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public String toString() {
        String output = "Character Name: " + name;
        output += "\nStrength: " + strength;
        output += "\nDexterity: " + dexterity;
        return output;
    }
}