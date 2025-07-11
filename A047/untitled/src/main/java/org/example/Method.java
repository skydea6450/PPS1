package org.example;

import java.util.Scanner;

public class Method {
    private String word;

    public void input(){
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
    }

    public void print(){
        int endIndex = 0;
        int startIndex = 0;

        while(startIndex < word.length()){
            endIndex = startIndex + 10;

            if(endIndex > word.length()){
                endIndex = word.length();
            }

            String text = word.substring(startIndex, endIndex);
            System.out.println(text);
            startIndex = endIndex;
        }
    }
}
