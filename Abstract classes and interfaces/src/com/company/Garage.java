package com.company;

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;

/**
 * Created by Arteman on 09.08.16.
 */
public class Garage <T extends Car>  {
    private String name;
    private ArrayList<T> cars = new ArrayList<>();

    public Garage(String name) {
        this.name = name;
    }

    public void add_car (T car){
        cars.add(car);
        System.out.println("Car - "+car.get_name()+" has been added to the list");
    }
}
