package org.example;

import org.example.Method;

public class Main {
    public static void main(String[] args) {
        Method m = new Method();

        int[] number = new int[5];

        for(int i = 0; i < 5; i++){
            number[i] = m.random();
        }

        int count = m.cal(number);

        System.out.println(number[0] + " " + number[1] + " " + number[2] + " " + number[3] + " " + number[4]);
        System.out.println(count);
    }
}