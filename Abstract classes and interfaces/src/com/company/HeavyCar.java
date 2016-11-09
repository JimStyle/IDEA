package com.company;

import java.util.ArrayList;

/**
 * Created by Arteman on 09.08.16.
 */
public class HeavyCar extends Car{
    private ArrayList<Integer> gears = new ArrayList<>();
    public HeavyCar(String name) {
        super(name);
    }

    public void setGears(ArrayList<Integer> gears) {
        this.gears = gears;
    }

    public int getGears(int num) {
        return gears.get(num);
    }

    @Override
    public String get_name() {
        System.out.println("In heavy car class");
        return super.get_name();
    }
}
