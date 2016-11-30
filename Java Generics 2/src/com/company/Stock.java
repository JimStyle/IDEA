package com.company;


/**
 * Created by Arteman on 05.09.16.
 */


public class Stock <T extends Number,U> extends Vehicle {
    //даем доступ только для типов наследуемых от класса Number
    private T quantity;
    private U gearbox;

    public Stock(String name, int engineSize, T quantity, U gearbox) {
        super(name, engineSize);
        int n = 1;
        this.quantity = quantity;
        this.gearbox = gearbox;
    }

    public U getGearbox() {
        return gearbox;
    }

    public T getQuantity() {
        return quantity;
    }

    public void setQuantity(T quantity) {
        this.quantity = quantity;
    }

    public void compare (Stock<?,?> o){
        if (o.quantity == this.quantity)
            System.out.println("Engines are equal");
        else
            System.out.println("Engines are different "+o.quantity+"   "+this.quantity);
    }
}