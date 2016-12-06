package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car1 = new Car("BMW",2016,5);
        Car car2 = new Car("AUDI",2015,2);
        Car car3 = new Car("Mercedes", 2014,4);

        Map<Integer, Car> family = new HashMap<>();
        family.put(3,car1);
        family.put(1,car2);
        family.put(2,car3);
        System.out.println(family.containsKey(3));

        for (Map.Entry<Integer,Car> entry : family.entrySet()) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
        System.out.println(family.remove(1));

        for (Map.Entry<Integer,Car> entry : family.entrySet()) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

        Integer [] values = {512, 8, 462};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(values));
        System.out.println(arrayList);
        arrayList.set(1,518);
        Integer [] newValues = new Integer[arrayList.size()];
        newValues = arrayList.toArray(newValues);
        System.out.println(newValues[1]);


    }
}
