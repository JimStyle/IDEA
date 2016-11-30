package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        Stock <Integer,ArrayList<Integer>> car1 = new Stock<>("Audi",5,1,arr);
        Stock <Double,ArrayList<Integer>> car2 = new Stock<>("BMW",4,1.2,arr);
        System.out.println(car1.getQuantity());
        System.out.println(car2.getQuantity());
        System.out.println(car2.getGearbox());
        car2.compare(car1);








    }
}

