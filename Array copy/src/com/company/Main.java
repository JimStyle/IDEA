package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Size = "+list.size());
        array_copy(new ArrayList<Integer>(list));
        System.out.println("Size = "+list.size());
    }

    public static void array_copy (List<Integer> array){
        array.add(4);
        System.out.println("Size = "+array.size());
    }
}
