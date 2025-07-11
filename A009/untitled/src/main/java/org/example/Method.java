package org.example;

import java.util.Scanner;

public class Method {
    public String input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public boolean check(String word){
        if(word.length() >=4 && word.length() <= 6){
            return word.matches("^\\d+$");
        }
        return false;
    }
}
