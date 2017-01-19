package com.company;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String html = "s</h2>This is a test</h2>s";
        String tag = "</h2>";


        //Замена всех символов которые встречаются в строке на Х
        System.out.println(html.replaceAll("[he]","X"));

        //Замена всех символов которые встречаются в строке. Проверяем отдельно на совпадение 4 пары - h2,h3,e2,e3
        System.out.println(html.replaceAll("[he][23]","X"));

        //Замена всех символов которые встречаются в строке. Проверяем на совпадение все буквы алфавита
        System.out.println(html.replaceAll("[a-z]","X"));

        //Замена только по результату совпадения всей строки
        System.out.println(html.replaceAll("h2","X"));

        //Проверка только начала строки
        System.out.println(html.replaceAll("^s","X"));

        //Проверка только начала строки. Точка - неважно какой символ. Звездочка - любое количество элементов
        System.out.println(html.replaceAll("^s.*","X"));

        //Проверка конца строки
        System.out.println(html.replaceAll("s$","X"));

        //Проверка конца строки
        System.out.println(html.replaceAll("s$","X"));

        //Заменяем все цифры в строке
        System.out.println(html.replaceAll("\\d","X"));

        //Замена только если всречаем h22
        System.out.println(html.replaceAll("h2{2}","X"));

        //Заменяем все что не s
        System.out.println(html.replaceAll("[^s]","X"));

        //Заменяем все что не s
        System.out.println(html.replaceAll("[s-t]+","X"));

        String h2pattern = "</h2>";
        Pattern pattern = Pattern.compile(h2pattern);
        Matcher matcher = pattern.matcher(html);
        //System.out.println(matcher.matches());

        //matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count ++;
            System.out.println("Occurence : " + count+" "+ matcher.start()+" "+matcher.end());
        }

        String h2GroupPattern = "(</h2>)(.+?)(</h2>)";
        Pattern grouppattern = Pattern.compile(h2GroupPattern);
        Matcher groupmatcher = grouppattern.matcher(html);
        System.out.println(groupmatcher.matches());
        groupmatcher.reset();

        while(groupmatcher.find()) {
            System.out.println("Occurence : " + groupmatcher.group(2));
        }

        //matcher.reset();


    }
}
