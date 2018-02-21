package com.company;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Auto bmw;//,audi;
        PassengerCar audi;
        bmw = new Auto(4.5);
        //bmw = new PassengerCar(4.4,2);
        audi = new PassengerCar(5.8,2);
        Auto vw = audi;
        //PassengerCar bmw2 = (PassengerCar) bmw;
        //System.out.println("bmw " + bmw2.getPass_number());

        System.out.println("vw " + vw.getPass_number());  // динамическое (позднее связывание)
        //System.out.println(((PassengerCar)bmw).getPass_number());


        System.out.println(bmw.getEngine());
        System.out.println(audi.getModel());
        System.out.println(CarInterface.model);

        Object oo4 = audi;
        if (oo4 instanceof Auto){
            System.out.println(((PassengerCar) oo4).getEngine());
        }

        //exceptions
        Integer n = null;
        try {
            if (n == null) {
                throw new NullPointerException();
            }
            System.out.println(2 * n);
        } catch (Exception e)
        {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }

        Field[] f = audi.getClass().getDeclaredFields();
        for (Field fi : f) {
            System.out.println(fi.toString());
        }

        //boxing and unboxing
        double d = 0.0;
        Double dd = null;
        dd = (Double) d;
        d = (double) dd;

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
