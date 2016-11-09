package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Auto bmw;
        bmw = new Auto();
        System.out.println(bmw.engine);
        System.out.println(bmw.getEngine());
        PassengerCar audi = new PassengerCar(4.8,5);
        System.out.println(audi.getEngine());
        HeavyCar man = new HeavyCar(6,12);
        System.out.println(man.getEngine());
        System.out.println(man.toString());
    }
}
