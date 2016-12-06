package com.company;

/**
 * Created by arteman on 05.12.16.
 */
public class Car {
    private String model;
    private int year;
    private int capacity;

    public Car(String model, int year, int capacity) {
        this.model = model;
        this.year = year;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                '}';
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getCapacity() {
        return capacity;
    }
}
