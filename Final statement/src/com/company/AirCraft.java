package com.company;

/**
 * Created by Arteman on 15.08.16.
 */
public class AirCraft implements Plane{

    private int engine_num;
    @Override

    public void set_engine(int engine_num) {
        this.engine_num = engine_num;
    }
}
