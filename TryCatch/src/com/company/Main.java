package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] A = new int[3];
        try{
            A[0] = 1;
            A[1] = 2;
            A[2] = 3;
            int i = 3;
            if (i>2)
                throw new IndexOutOfBoundsException("Array A doesn't have element - "+i);
            //A[i] = 4;

            System.out.println("Everything is ok");
        }
        catch (IndexOutOfBoundsException e ){
            System.out.println("Error in the catch block = "+e.getMessage());
        }
       // catch(Error e ){
       //     System.out.println("Error = "+e);
     //   }
        //finally {
        //    System.out.println("Operation has been interrupted");
       // }
        System.out.println("We are back");
    }
}
