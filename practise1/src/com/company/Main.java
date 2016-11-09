package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int p;

    public static void main(String[] args) {
	// write your code here

        List<Integer> arraymy = new ArrayList<>() ;
        System.out.print("Size of arraymy = "+arraymy.size());

        ArrayList<Integer> arraymy2 = new ArrayList<>() ;
        arraymy.add(5);
        System.out.println("Size of arraymy = "+arraymy.size());
        System.out.println("Last element of arraymy = "+arraymy.get(arraymy.size()-1));
       // arraymy.clear();
       // System.out.println("Size of arraymy = "+arraymy.size());
        arraymy.set(0,6);
        System.out.println("Last element of arraymy = "+arraymy.get(arraymy.size()-1));
        System.out.println("Position of 6 = "+arraymy.lastIndexOf(6));
        arraymy2.addAll(arraymy);
        System.out.println("Size of arraymy2 = "+arraymy2.size());
        System.out.println("Last element of arraymy2 = "+arraymy2.get(arraymy2.size()-1));

        int i,j;
        String name;
        i = 4;
        p = 4;
        int [] num = new int [i];
        int [] num2 = new int [3];
        num[0]=2;
        num[1]=8;
        num[2]=3;
        num[3]=1;
        //num = sort(num);

        for (i=0; i<4; i++)
            System.out.println(num[i]);
        num = sort(num);
        for (i=0; i<4; i++)
            System.out.println(num[i]);
        name = "Artem";
        System.out.println("Artem");
        System.out.println("Length =  " +num.length);
        num2[2] = num[0];
        for (i=0; i<3; i++)
            System.out.println(num2[i]);
    }

    public static int [] change (int [] A){
        A[0] = 3;
        A[1] = 4;
        System.out.println("p  = "+ p);
        return A;

    }
    public static int [] sort (int [] A){
        boolean f = true;
        int i,temp;
        while (f){
            f = false;
            for (i = 0; i < A.length-1; i++ ){
                if (A[i] > A[i+1]){
                    temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                    f = true;
                }
            }
        }
        return A;

    }

    public static ArrayList sort (ArrayList<Integer> array){
        boolean f = true;
        int i,temp;
        while (f){
            f = false;
            for (i = 0; i < array.size()-1; i++ ){
                if (array.get(i) > array.get(i+1)){
                    temp = array.get(i);
                    array.set(i,array.get(i+1));
                    array.set(i+1,temp);
                    f = true;
                }
            }
        }
        return array;

    }

}
