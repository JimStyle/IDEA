package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("doc","text file");
        vocabulary.put("pdf","Adobe Acrobat Reader file");
        vocabulary.put("xls","Microsoft Excel file");

        System.out.println(vocabulary.get("doc"));
        System.out.println("Size = "+vocabulary.size());
        System.out.println(vocabulary.containsValue("text filef"));
        System.out.println(vocabulary.keySet());
        for (String str: vocabulary.keySet())
            System.out.println(str+" "+vocabulary.get(str));

        //split
        String [] str = "Java virtual machine".split(" ");
        for (String s: str)
            System.out.println(s);

        Vocabulary voc1 = new Vocabulary(1,"yo");
        Vocabulary voc2 = new Vocabulary(2,"yo2");
        voc1.add_next(voc2);
        System.out.println(voc1.get_element(0));

	// write your code here
    }
}
