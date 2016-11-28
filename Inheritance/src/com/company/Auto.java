package com.company;

/**
 * Created by Arteman on 13.07.16.
 */
public class Auto {
    private double engine;

    public Auto(double engine) {
        this.engine = engine;
    }
    public Auto() {
        this.engine = 0;
    }

    public double getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "engine=" + engine +
                '}';
    }
}
