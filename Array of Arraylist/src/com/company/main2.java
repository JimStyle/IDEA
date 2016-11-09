package com.company;
import java.util.Arrays;
/**
 * Created by Arteman on 05.10.16.
 */
public class main2 {
    public static void main(String[] args) {

        int [] arr1 = new int [3];
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;
        int [] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(arr2[2]);
        arr1[2] = 3;
        System.out.println(arr2[2]);
        for(int i = 0; i < 3; ++i)
            System.out.println("i = "+i);
    }
}
