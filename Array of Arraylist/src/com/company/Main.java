package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {

   // List<List<String>> permutations = new ArrayList<List<String>>();
    public static void main(String[] args) {

       // List<List<String>> permutations = new ArrayList<List<String>>();

        List<String> subseqs = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            String subseq = in.next();
            System.err.println(subseq);
            subseqs.add(subseq);
        }
        //Collections.reverse(subseqs);

        PermutationAndSequencingHandler handler = new PermutationAndSequencingHandler(N, subseqs);
        handler.permute();
        handler.showPermutations();
        int shortest = handler.findShortestSequence();
        System.out.println(String.valueOf(shortest));
    }
}

class PermutationAndSequencingHandler {
    int n;
    private List<String> elements;
    private List<String[]> permutations = new ArrayList<String[]>();

    public PermutationAndSequencingHandler (int n, List<String> elements) {
        this.n = n;
        this.elements = elements;
    }

    public void permute() {
        permute(0, new String[n]);
    }

    public void showPermutations () {
        System.out.println("in here");
        for (int i = 0; i < permutations.size(); i++) {
            for (int j = 0; j < permutations.get(i).length; j++)
                System.out.print(permutations.get(i)[j] + " ");
        System.out.println();
        }
        //for(String []s: permutations)
         //   System.out.println(s[0]);
    }
    private void permute(int index, String[] array) {
        System.out.println("in permute");
        if (index == n) {
            System.out.println("write");
            permutations.add(array);
        } else {
            String element = elements.get(index);
            for (int i = 0; i < n; ++i) {
                System.out.println("i = "+i);
                if (array[i] == null) {
                    String[] arr = Arrays.copyOf(array, n);
                    arr[i] = element;
                    permute(index + 1, arr);
                }
                else
                    System.out.println("not null");
            }

        }
    }

    public int findShortestSequence() {
        int shortest = Integer.MAX_VALUE;
        for (String[] permutation : permutations) {
            int length = calcLength(permutation);
            if (length < shortest) {
                shortest = length;
            }
        }
        return shortest;
    }

    private int calcLength(String[] permutation) {
        StringBuilder builder = new StringBuilder();
        builder.append(permutation[0]);
        for (int i = 1; i < n; ++i) {
            int j = i - 1;

            String first = permutation[j];
            String second = permutation[i];

            int bestLength = 0;
            if (first.contains(second)) {
                bestLength = second.length();
            } else {
                for (int ec = 1; ec < Math.min(first.length(), second.length()); ++ec) {
                    String firstSub = first.substring(first.length() - (ec));
                    String secondSub = second.substring(0, ec);
                    if (firstSub.equals(secondSub)) {
                        bestLength = ec;
                    }
                }
            }

            builder.append(second.substring(bestLength));
        }
        System.err.println(builder.toString());
        return builder.toString().length();
    }
}
