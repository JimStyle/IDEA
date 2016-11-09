package com.company;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by dev on 17/02/2016.
 */
public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            //int inBasket = list.getOrDefault(item, 0);
            int inBasket = 0;
            if (list.get(item)!= null)
                inBasket = list.get(item);
            //try to reserve;
            if ( item.reserveStock(quantity) == 0)
                System.out.println("Not enough supply in stock");
            else {
                System.out.println("Reservation confirmed");
                list.put(item, inBasket + quantity);
                return inBasket;
            }
        }
        return 0;
    }

    public boolean removefromBasket (StockItem item, int quantity){
        if ((item != null ) && (quantity > 0)){
            if ((list.get(item) != null) && (quantity <= list.get(item))) {
                item.unreserveStock(quantity);
                list.put(item, list.get(item)-quantity);
                System.out.println(item.getName()+". Quantity = "+quantity+" removed from basket");
                return true;
            }
        }
        System.out.println("Operation no permitted");
        return false;
    }

    public void checkOut (){
        int quantity;
        boolean problem = false;
        for ( Map.Entry<StockItem, Integer> item : list.entrySet()) {
            quantity = item.getKey().checkfinaliseStock(item.getValue());
            if (quantity == 0)
                problem = true;
        }
        if (problem)
            System.out.println("Problem during checkout. Not enough reserved items");
        else {
            System.out.println("Check out completed");
            for ( Map.Entry<StockItem, Integer> item : list.entrySet())
                quantity = item.getKey().finaliseStock(item.getValue());
            list.clear();
        }
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " reserved\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}