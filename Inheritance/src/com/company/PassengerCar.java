package com.company;

/**
 * Created by Arteman on 13.07.16.
 */
public class PassengerCar extends Auto{
    private int pass_number;
    private int engine;

    public PassengerCar(double engine, int pass_number) {
        super(engine);
        this.pass_number = pass_number;
    }
    public PassengerCar( int pass_number) {
        //super(engine);
        this.pass_number = pass_number;
    }

    @Override
    public double getEngine() {
        System.out.println("In passenger car");
        //return super.getEngine();
        return super.engine;
    }
}
