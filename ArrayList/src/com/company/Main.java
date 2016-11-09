package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("Audi");
            System.out.println(arr.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
