package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //TreeSet
        SortedSet<String> list =new TreeSet<>();
        list.add("Moscow");
        list.add("New York");
        list.add("Kiev");
        list.add("Kiev");
        System.out.println(list);

//        //LinkedList/Set
//        Set<String> list =new HashSet<>();
//        list.add("Moscow");
//        list.add("New York");
//        list.add("Kiev");
//        list.add("Kiev");
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            //iterator.remove();
//        }

        //System.out.println(list.get(0));
//        System.out.println(list.contains("Moscow"));
//        list.remove(2);
//        System.out.println(list);



        //ArrayList;
        int[] arr = {1,2,3,4,5};
        //printmy(arr);
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.set(2,8);
        System.out.println(arrlist);
        System.out.println(arrlist.size());
        ArrayList<Integer> arrlist2 = new ArrayList<>(arrlist);
        //ArrayList<Integer> arrlist2 = arrlist;
        arrlist2.add(0,5);
        System.out.println(arrlist.get(0));
        System.out.println(arrlist2.get(0));
        System.out.println(arrlist2.contains(3));
        System.out.println(arr.length);
        Integer[] arr2 = new Integer[arrlist2.size()];
        Object [] arr3;
        arr3 = arrlist2.toArray();
        printmy(arr3);
        arr2 = arrlist2.toArray(arr2);
        printmy(arr2);
        List<String> places = Arrays.asList("kiev","moscow","dubai");
        System.out.println(places);
    }
    public static <U> void printmy (U[] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);
        System.out.println();
    }
}
