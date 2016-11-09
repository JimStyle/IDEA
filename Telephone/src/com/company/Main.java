package com.company;

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String tel1,tel2;
        int n;
        int i;
        n = 2;
        tel1 = "0123456789";
        tel2 = "2345678";
        Telephone t[] = new Telephone[n];
        ArrayList<Integer> tel = new ArrayList<>();
        for (int j =0 ; j < n; j++) {

            for (i = 0; i < tel1.length(); i++)
                tel.add(Integer.parseInt(tel1.substring(i, i + 1)));
            t[j] = new Telephone();
            t[j].setTel(tel);
            t[j].show_tel();
            tel.add(1);
        }
        t[1].show_tel();

        int f = 5;
        Simple h = new Simple(f);
        System.out.println(h.getP());
        f = 4;
        System.out.println(h.getP());

    }
}
