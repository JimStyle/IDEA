package com.company;

import java.util.*;

/**
 * Created by Arteman on 19.08.16.
 */
public class Vocabulary {
    int number;
    String word;
    private ArrayList<Vocabulary> vocabulary;

    public Vocabulary(int number, String word) {
        this.number = number;
        this.word = word;
        vocabulary = new ArrayList<>();
    }

    public void add_next (Vocabulary word){
        vocabulary.add(word);

    }

    public String get_element(int num){
        return vocabulary.get(num).word;
    }
}
