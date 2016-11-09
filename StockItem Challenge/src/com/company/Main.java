package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, StockItem> list = new LinkedHashMap<>();

        StockItem bread = new StockItem("bread",2.5,50);
        StockItem water = new StockItem("water",1,100);
        StockItem apple = new StockItem("apple",3,150);

        list.put(bread.getName(), bread);
        list.put(water.getName(), water);
        list.put(apple.getName(), apple);
        Iterator litr = list.keySet().iterator();
        System.out.println(litr.next());
        System.out.println(litr.next());
        

       // System.out.println(list.keySet().iterator().next().);
        //for (Map.Entry<String, StockItem> i : list.entrySet())
        //    System.out.println(i.getKey()+"-----"+i.getValue());


        //bread = new StockItem("bread",2.5,10);

        StockList stockList = new StockList();
        stockList.addStock(bread);
        stockList.addStock(water);
        stockList.addStock(apple);



        System.out.println(stockList);
        Basket basket1 = new Basket("Jimi basket");
        basket1.addToBasket(bread,10);
        basket1.addToBasket(bread,15);
        basket1.addToBasket(apple,20);
        System.out.println(basket1);
        System.out.println(stockList);

        basket1.removefromBasket(bread, 10);
        System.out.println(basket1);
        System.out.println(stockList);

        basket1.checkOut();
        System.out.println(basket1);
        System.out.println(stockList);
        //bread = new StockItem("bread",2.5,10);
        //stockList.addStock(bread);
        //System.out.println(stockList);

       // stockList.sellStock("bread",10);
       // stockList.sellStock("bred",10);

      //  System.out.println(stockList);


       // System.out.println(list.get(bread.getName()));
       // System.out.println(list.size());
        //Collections.sort(list, );


        //for (Map.Entry<String, StockItem> i : list.entrySet())
         //   System.out.println(i.getValue());

       // System.out.println(bread);
       // System.out.println(water);
       // System.out.println(apple);
    }
}
