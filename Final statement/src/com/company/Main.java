package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cars car1 = new Cars("BMW",1);
        System.out.println(car1.getName());
        System.out.println(car1.getCount());
        Cars car2 = new Cars("Audi",1);
        System.out.println(car2.getName());
        System.out.println(car2.getCount());
        System.out.println(car2.getSeats());
        //Cars.Seat s1 = car1.new Seat(1);
        //Cars.Seat s2 = car1.new Seat(2);
        //s1.setDrivers_seat(true);
        car1.add_seat(1);
        car1.add_seat(2);
        System.out.println("Seats = "+car1.getSeats());
        System.out.println("Is driver's seat"+car1.getSeat(0).isDrivers_seat());
        car1.getSeat(0).setDrivers_seat(true);
        System.out.println("Is driver's seat"+car1.getSeat(0).isDrivers_seat());



    }
}
