package org.example;

import java.util.Scanner;

public class Method {
    String s;
    String t;

    public void input(){
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        t = sc.nextLine();
    }

    public void check(){
        StringBuilder resultBuilder1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '#') {
                if (!resultBuilder1.isEmpty()) {
                    resultBuilder1.deleteCharAt(resultBuilder1.length() - 1);
                }
            } else {
                resultBuilder1.append(currentChar);
            }
        }

        StringBuilder resultBuilder2 = new StringBuilder();
        for (int j = 0; j < t.length(); j++) {
            char currentChar1 = t.charAt(j);

            if (currentChar1 == '#') {
                if (!resultBuilder2.isEmpty()) {
                    resultBuilder2.deleteCharAt(resultBuilder2.length() - 1);
                }
            } else {
                resultBuilder2.append(currentChar1);
            }
        }

        if(resultBuilder1.toString().equals(resultBuilder2.toString())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
