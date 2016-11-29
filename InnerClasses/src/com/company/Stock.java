package com.company;

/**
 * Created by arteman on 29.11.16.
 */
public class Stock {
    private String itemname;
    private int quantity;

    public Stock(String itemname, int quantity) {
        this.itemname = itemname;
        this.quantity = quantity;
    }
    public Stock() {
        this.itemname = "";
        this.quantity = 0;
    }
    public class Modification {
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
