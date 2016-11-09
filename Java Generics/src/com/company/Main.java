package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Stock <Integer> car1 = new Stock<>("Audi",5,1);
        Stock <String> car2 = new Stock<>("BMW",4,"1");
        car2.compare(car1);

        String s = "test" ;
        //char [] s2 = new char [4];
        int start = 4 ;
        int end = 8 ;
        String s2 = new String("");
        //System.out.println(s2);
        System.out.println(s.equals(s2));
        System.out.println(s == s2);
        System.out.println(s.compareTo(s2));
        System.out.println(s.indexOf('e'));
        System.out.println(s.substring(1,3));
        System.out.println(s2 == null);
        System.out.println(s.replace("e","r"));
        System.out.println(Integer.toString(end));
        System.out.println(System.nanoTime());





    }
}
