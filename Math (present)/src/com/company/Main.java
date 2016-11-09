package com.company;
import java.util.*;
import java.io.*;
import java.math.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

                Scanner in = new Scanner(System.in);
                int N = in.nextInt();
                int C = in.nextInt();
                int i,total_budget=0;
                System.err.println("N = "+N);
                System.err.println("C = "+C);
                ArrayList<Integer> budget = new ArrayList<>();
                for (i = 0; i < N; i++) {
                    budget.add(in.nextInt());
                    total_budget+= budget.get(i);
                    System.err.print(budget.get(i)+" ");
                }
                System.err.println();
                System.err.println("total_budget = "+total_budget);
                if (total_budget < C)
                    System.out.println("IMPOSSIBLE");
                else {
                    int equal_sum,change;
                    ArrayList<Integer> result = new ArrayList<>();
                    ArrayList<Integer> over_budget = new ArrayList<>();
                    equal_sum = C/N;
                    change = C-N*equal_sum;
                    System.err.println("equal_sum = "+equal_sum);
                    System.err.println("change = "+change);
                    boolean limit_ok = true;
                    for (i = 0; i < N; i++){
                        result.add(equal_sum);
                        if (result.get(i) > budget.get(i)){
                            limit_ok = false;
                            over_budget.add(i);
                        }
                    }
                    if (limit_ok){
                        if (change == 1){
                            for (i = 0; i < N-1; i++)
                                System.out.println(result.get(i));
                            System.out.println(result.get(i)+1);
                        }
                    }
                    else {
                        for (i = 0; i < over_budget.size(); i++){
                            change += result.get(over_budget.get(i)) - budget.get(over_budget.get(i));
                            result.add(over_budget.get(i),budget.get(over_budget.get(i)));
                        }
                        equal_sum = change / (budget.size()-over_budget.size());
                        total_budget = 0;
                        System.err.println("equal_sum = "+equal_sum);
                        System.err.println("change = "+change);
                        System.err.println("over budget size = "+over_budget.size());
                        for (i = 0; i < N; i++)
                            System.err.print(result.get(i)+" ");
                        System.err.println();
                        System.err.println(result.size());
                        for (i = 0; i < result.size(); i++){
                            if (!over_budget.contains(i)){

                                System.err.println("result.get(i) = "+result.get(i));
                                System.err.println("equal_sum = "+equal_sum);
                                //result.add(result.get(i)+equal_sum);

                            }
                            System.err.println(i);
                            total_budget+= result.get(i);
                        }
                        Collections.sort(result);
                        change = C - total_budget;
                        if (change == 1){
                            for (i = 0; i < N-1; i++)
                                System.out.println(result.get(i));
                            System.out.println(result.get(i)+1);
                        }

                    }
                    //System.err.print("equal_sum = "+equal_sum);
                }
                // Write an action using System.out.println()
                // To debug: System.err.println("Debug messages...");

                //System.out.println("IMPOSSIBLE");
            }
        }
