package com.company;

/**
 * Created by Arteman on 13.07.16.
 */
public class HeavyCar extends Auto {
    private int max_weight;

    public HeavyCar(double engine, int max_weight) {
        super(engine);
        this.max_weight = max_weight;
    }
}
