package com.company;

import java.util.ArrayList;

/**
 * Created by Arteman on 07.07.16.
 */
public class Telephone {
    private ArrayList<Integer> tel;

   // public Telephone() {
   //     this.tel = tel;
   // }

    public void setTel(ArrayList<Integer> tel) {
        this.tel = tel;
    }

    public void show_tel() {
        for (int i = 0; i < tel.size(); i++)
        System.out.print(tel.get(i));
        System.out.println();

    }
}
