package com.company;

import apple.laf.JRSUIUtils;

import java.util.*;

class Tcomp implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

}

public class Main {


    public static void main(String[] args) {
	// write your code here

        TreeMap<Integer,String> map = new TreeMap<Integer, String>();
        map.put(2,"BMW");
        map.put(1,"Audi");
        map.put(3,"Mercedes");
        System.out.println(map);


       // for (Map.Entry<Integer,String> i : map.entrySet()){
       //     System.out.println(i.getValue());
       // }

        ArrayList<String> arr = new ArrayList<>();
        arr.add(0,"0");
        arr.add(1,"1");
        arr.add(2,"2");
        arr.add(3,null);
        for (String i: arr)
            System.out.println(i);

        Iterator<String> it = arr.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
