package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("yo");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Audi");
        arr.add("BMW");
        arr.add("Mercedes");
        for (String s: arr)
            System.out.println(s);
        arr.add("Ford");
    }
}
