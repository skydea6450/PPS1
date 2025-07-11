package org.example;

import org.example.Method;

public class Main {
    public static void main(String[] args) {
        Method m = new Method();

        String word = m.input();

        boolean b = m.check(word);

        if(b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}