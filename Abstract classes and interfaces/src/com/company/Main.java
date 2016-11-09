package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PassangerCar car1 = new PassangerCar("BMW");
        PassangerCar car2 = new PassangerCar("AUDI");
        HeavyCar hcar1 = new HeavyCar("MAN");
        HeavyCar hcar2 = new HeavyCar("Scania");
        System.out.println(car1.get_name());
        Garage my1 = new Garage("my1");
        ArrayList<Integer> gears = new ArrayList<>();
        gears.add(1);
        gears.add(2);
        gears.add(3);

        hcar1.setGears(gears);
        my1.add_car(car1);
        my1.add_car(hcar1);

    }


}

