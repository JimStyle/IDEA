package com.company;

/**
 * Created by Arteman on 04.08.16.
 */
public class Car {
    double engine;
    int passengers;

    public Car(double engine, int passerngers) {
        this.engine = engine;
        this.passengers = passerngers;
    }

    public double getEngine() {
        return engine;
    }

    public int getPasserngers() {
        return passengers;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setPasserngers(int passerngers) {
        this.passengers = passerngers;
    }
}
