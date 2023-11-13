package com.example.javacoredemo.generics.classes;

public class Dog extends Animal {
    double walkDistancePreference;
    public Dog(String name, int age, double walkDistancePreference) {
        super("dog", name, age);
        this.walkDistancePreference = walkDistancePreference;
    };
    public double getWalkDistancePreference() {
        return walkDistancePreference;
    };
    public void setWalkDistancePreference(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    };
}
