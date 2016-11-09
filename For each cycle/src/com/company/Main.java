package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        for (int i : array)
            System.out.println(i);
    }
}
