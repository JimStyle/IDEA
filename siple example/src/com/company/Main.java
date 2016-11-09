package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scanner = null;
       // scanner = new Scanner(new BufferedReader(new FileReader("locations.txt")));
        scanner = new Scanner(new FileReader("locations.txt"));
        scanner.useDelimiter(",");
        while (scanner.hasNextLine()){
            String [] data = scanner.nextLine().split(",");
            int number = Integer.parseInt(data[0]);
            String model = data[1];
            System.out.println("Car # "+number+". Model - "+model);
        }
        scanner.close();
        System.out.println("Operation succesful");

     /*   Scanner scanner = null;
        int i = 0;
        int [] A = new int[8];
        scanner = new Scanner(new FileReader("locations.txt"));
        while (scanner.hasNextLine()){
            //System.out.println("in here");
            A[i++] = scanner.nextInt();

        }
        scanner.close();
        for (int j : A)
            System.out.println(j);*/


      /*  System.out.println("Enter a integer value");
        //System.in.read("Enter in integer");
       // String n = scanner.next();
        int [] A = {1,2,3,4,5};
        System.out.println("Your value is = ");
        FileWriter locfile = null;
        try {
            locfile =  new FileWriter("locations.txt");
            locfile.write("My first output in to the file\n");
            for (int j: A)
                locfile.write( Integer.toString(j)+"\n");
            //throw new IOException("Exception generated");
            //locfile.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        finally {
            locfile.close();
        }*/
    }
}
