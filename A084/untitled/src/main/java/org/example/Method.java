package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Method {
    private String word;
    private String[] text;

    public void input(){
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        text = new String[word.length()];
        for (int i = 0; i < text.length; i++) {
            text[i] = word.substring(i);
        }
    }

    public void sorting(){
        Set<String> set = new HashSet<String>(Arrays.asList(text));

        set.stream().sorted().forEach(System.out::println);
    }
}
