package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hotel Astoria = new Hotel("Astoria",80, Hotel.Hotel_Type.LUX);
        Hotel Astoria2 = new Hotel("Astoria",80, Hotel.Hotel_Type.LUX);
        System.out.println(Astoria);
        System.out.println(Arrays.toString(Hotel.Hotel_Type.values()));
        Hotel Bristol = new Hotel("Bristol",100, Hotel.Hotel_Type.ECONOMY);
        System.out.println(Bristol);
        System.out.println("Astoria HashCode = "+Astoria.hashCode());
        System.out.println("Astoria2 HashCode = "+Astoria2.hashCode());
        System.out.println("Bristol HashCode = "+Bristol.hashCode());
        System.out.println(Astoria.equals(Astoria2));
        Astoria2 = Astoria;
        Astoria2 = null;
        System.out.println("Astoria HashCode = "+Astoria.hashCode());
        System.out.println(Astoria.equals(Bristol));

    }
}
