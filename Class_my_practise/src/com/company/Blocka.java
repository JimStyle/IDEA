package com.company;

/**
 * Created by Arteman on 02.07.16.
 */

class Blocka {
    private int [][] way;// = new int[2][3];
    private int i,j;
    //    void set_values (int count, int in, int out);
    //    void show_values ();
    //    int find_exit (int dir);

   public Blocka (){
        System.out.println("yo");
        this.way = new int[2][3];
  //      System.out.println("yo");
    }

    public Blocka(int[][] way) {
        System.out.println("no");
        this.way = way;
    }

    public void set_values (int count, int in, int out){
       // System.out.println("yo");
        way[0][count] = in;
        way[1][count] = out;
    }

    public void show_values (){
        for ( i = 0; i < 2; i++){
            for ( j = 0; j < 3; j++)
                System.out.print(way[i][j]+" ");
            System.out.println();
        }
    }

    public int find_exit (int dir){
        for ( i = 0; i < 3; i++)
            if (dir == way[0][i])
                return way[1][i];
        return -1;
    }
}
