package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("yo");
        Blocka type [] = new Blocka [4];
        type[0] = new Blocka ();
        type[0].show_values();
        type[0].set_values(0,-1,-1);
        type[0].set_values(1,-1,-1);
        type[0].set_values(2,-1,-1);
        type[0].show_values();

        //example with arrays
        int [] A1 = new int[2];
        A1[0] = 1;
        A1[1] = 2;
        System.out.println("A1[1] = "+A1[1]);
        int [] A2;
        A2 = A1;
        A2[1] = 3;
        System.out.println("A1[1] = "+A1[1]);

        //example with simple object
       // Simple obj = new Simple();
       // Simple obj2;
        int [] A3 = new int [2];
        A3[0] = 1;
        A3[1] = 2;
        Simple obj = new Simple(new int [] {1,2});
        //obj.setI(A3);
        System.out.println("Obj i = "+obj.getI());
        //obj2 = obj;
        //obj2.setI(4);
        //System.out.println("Obj i = "+obj.getI());
        //* int y;
    }
}
