package com.company;

import java.util.Comparator;

/**
 * Created by Arteman on 13.07.16.
 */
public class PassengerCar extends Auto implements Comparable<PassengerCar>{
    private int pass_number;
    //private int engine;

    public PassengerCar(double engine, int pass_number) {
        super(engine);
        this.pass_number = pass_number;
    }
    public PassengerCar( int pass_number) {
        //super(engine);
        this.pass_number = pass_number;
    }

    public int getPass_number() {
        return pass_number;
    }

    @Override
    public double getEngine() {
        System.out.print("In passenger car - ");
        return super.getEngine();
    }

    @Override
    public int compareTo(PassengerCar o) {
        int engineSize = (int) o.getEngine();
        return ((int) this.getEngine()) - engineSize;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "pass_number=" + pass_number +
                '}'+super.toString();
    }

    public static Comparator<PassengerCar> Enginecomparator = new Comparator<PassengerCar>() {
        @Override
        public int compare(PassengerCar o1, PassengerCar o2) {
            return o1.compareTo(o2);
        }
    };
}
