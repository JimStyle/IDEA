package com.company;

/**
 * Created by Arteman on 09.08.16.
 */
public class PassangerCar extends Car{

    public PassangerCar(String name) {
        super(name);

    }

    @Override
    public String get_name() {
        System.out.println("In passanger car class");
        return super.get_name();
    }
}
