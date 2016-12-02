package com.company;

/**
 * Created by arteman on 29.11.16.
 */
public class Stock {
    private String itemname;
    private static int quantity;

    public Stock(String itemname, int quantity) {
        this.itemname = itemname;
        this.quantity = quantity;
    }
    public Stock() {
        this.itemname = "";
        this.quantity = 0;
        Modification mod = new Modification();
        mod.showModification();
        int a = mod.type;
        System.out.println("in Here");
    }
    public static class Modification {
        public int type = 5;
        public void showModification(){
            if (quantity > 5)
                System.out.println("Must be kept on a large stock");
        }
    }

    @Override
    public String toString() {
       // Modification mod = new Modification();
       // mod.showModification();
        return "itemname='" + itemname + '\'' +
                ", quantity=" + quantity;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
