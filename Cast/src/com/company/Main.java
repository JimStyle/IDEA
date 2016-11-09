package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //int n;
        double d;
        float y;
        int  myList [] = {1,2,3};
        char c1 = '\uface';
        System.out.println("c1 = "+c1);
        for(Object i: myList)
            System.out.println("Array "+(Integer)i);
        y = 10.1f;
        System.out.println("f = "+y);
        Integer n = 1;

            System.out.println(Math.abs(n));
        d = 1.2345;
        d+= 0.0001;
        System.out.println("n = "+n);
        System.out.println("d = "+d);
        n = (int) d;

        int [] array = new int[3];
        String arr = "3";
        n = Integer.parseInt(arr);
        if (arr.equals("b"))
            System.out.println("Empty string");
        array[0] = 4;
        array[1] = 2;
        array[2] = 3;
        for(Object i: array)
            System.out.println("Array "+(Integer)i);

    }
}
