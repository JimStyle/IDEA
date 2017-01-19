package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("yo");
        List<String> arr = new ArrayList<>();

        String str = "";
        if (str != null && !str.isEmpty()) {
            arr = Arrays.asList(str.split(","));
            if (arr.size() > 6) {
                System.out.println("Error1");
            }
            System.out.println(arr);
            try {
                for (String s : arr) {
                    if (Integer.parseInt(s) < 2 || Integer.parseInt(s) > 7) {
                        System.out.println("Error2");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            System.out.println(arr);
        } else {
            arr = Arrays.asList("2,3,4,5,6,7");
        }
        System.out.println(arr);
    }
}
