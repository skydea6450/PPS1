package org.example;

import java.util.Scanner;

public class Method {
    private int x;
    private String[] text;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number > ");
        x = sc.nextInt();
        text = new String[x];
        sc.nextLine();
        for(int i = 0; i < x; i++){
            text[i] = sc.next();
        }
    }

    public void print(){
        StringBuilder commonPrefixBuilder = new StringBuilder();

        int minLength = Math.min(text[0].length(), Math.min(text[1].length(), text[2].length()));

        for (int i = 0; i < minLength; i++) {
            char char0 = text[0].charAt(i);
            char char1 = text[1].charAt(i);
            char char2 = text[2].charAt(i);

            if (char0 == char1 && char1 == char2) {
                commonPrefixBuilder.append(char0);
            } else {
                break;
            }
        }

        System.out.println(commonPrefixBuilder.toString());
    }
}

