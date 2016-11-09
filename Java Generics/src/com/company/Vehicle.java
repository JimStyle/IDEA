package com.company;

/**
 * Created by Arteman on 05.09.16.
 */
public class Vehicle {
    private String name;
    private int engineSize;

    Vehicle (String name, int engineSize){
        this.name = name;
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }
}
