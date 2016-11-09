package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        Cars car1 = new Cars("Mazda",2012,38);
        Cars car2 = new Cars("BMW",2014,60);
        System.out.println(car1);
        System.out.println(car2);

        //parse String
        String mail = "a@parus.ua, b@parus.ua";
        ArrayList<String> mailArr = new ArrayList<>();
        //System.out.println(mail.indexOf('*'));
//        String array [] = new String [5];
//        array = mail.split(",");
//        System.out.println(array.length);
//        for (int i = 0; i < array.length; i++)
//            System.out.println(array[i]);
//
//        while (mail.indexOf(',') != -1){
//            mailArr.add(mail.substring(0,mail.indexOf(',')));
//            mail = mail.substring(mail.indexOf(',')+2,mail.length());
//        }

        System.out.println(mail);
        //mail = null;
        mail = mail.replace(",","");
        System.out.println(mail);
//        mail = "a@parus.ua, b@parus.ua";
//        List<String> eMails = new ArrayList<>();
//        eMails.addAll(Arrays.asList(mail.replace(" ", "").split(",")));
//
//        for (String s: eMails)
//            System.out.println(s);
    }
}

