package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Auto bmw,audi;
        bmw = new PassengerCar(4.4,2);
        audi = new PassengerCar(5.8,2);
        System.out.println(((PassengerCar)bmw).getPass_number());

        //System.out.println(audi.compareTo(bmw));


       //System.out.println(bmw.getEngine());

//        System.out.println(bmw.getEngine());
//        PassengerCar audi = new PassengerCar(4.8,5);
//        System.out.println(audi.getEngine());
//        HeavyCar man = new HeavyCar(6,12);
//        System.out.println(man.getEngine());
//        System.out.println(man.toString());
    }
}
