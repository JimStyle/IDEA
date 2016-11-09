package com.company;


/**
 * Created by Arteman on 05.09.16.
 */
public class Stock <T> extends Vehicle {
    T quantity;

    public Stock(String name, int engineSize, T quantity) {
        super(name, engineSize);
        this.quantity = quantity;
    }

    public void compare (Stock<?> o){
        if (o.quantity == this.quantity)
            System.out.println("Engines are equal");
        else
            System.out.println("Engines are different "+o.quantity+"   "+this.quantity);
    }
}
