package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stock apple = new Stock("apple",20);
        Stock.Modification mod = apple.new Modification();
        mod.showModification();
        Stock pear = new Stock("pear",10);
        Stock grapes = new Stock("grapes",15);
        ArrayList<Stock> stock = new ArrayList<>();
        stock.add(apple);
        stock.add(grapes);
        stock.add(pear);
        //Collections.sort(stock);
        for (Stock s : stock)
            System.out.println(s);
        //System.out.println(stock.get(0).getQuantity());
    }
}
