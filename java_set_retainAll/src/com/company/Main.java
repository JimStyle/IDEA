package com.company;

import java.util.*;


class Experiment {
    private int t;
    private Set<Integer> s;
    public Experiment (int a, int b){
        this.t = 0;
        s = new HashSet<>();
        for (int i=a; i<a+b; i++)
            s.add(i);
    }
    public int getT(){
        return this.t;
    }

    public Set<Integer> getS(){
        return this.s;
    }
    public void setT(int t){
        this.t += t;
    }

    public int compareValues (Experiment ex){
        Set<Integer> set = new HashSet<>(this.s);
        set.retainAll(ex.getS());
        return set.size();
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Experiment> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int J = in.nextInt();
            int D = in.nextInt();
            list.add(new Experiment(J,D));
        }
        if (N == 1)
            System.out.println(1);
        else{
            boolean f = true;
            int calc = 0;
            while (f && list.size()>1){
                System.out.println("calc = " + calc);
                calc++;
                f = false;
                int maxPos = 0;
                for (int i = 0; i < list.size(); i++){
                    for (int j = 0; j < list.size(); j++){
                        if (i!=j){
                            list.get(i).setT(list.get(i).compareValues(list.get(j)));
                        }
                    }
                    if (list.get(i).getT() > list.get(maxPos).getT()){
                        maxPos = i;
                        f = true;
                    }

                }
                if (!f && list.get(0).getT() > 0)
                    f = true;
                for (int i = 0; i < list.size(); i++){
                    list.get(i).setT(-list.get(i).getT());
                   // System.out.println("t ="+list.get(i).getT());
                }
                if(f) {
                    list.remove(maxPos);
                    System.out.println(maxPos);
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(list.size());
        }

    }
}
