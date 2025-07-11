package org.example;

import org.example.Method;

public class Main {
    public static void main(String[] args) {
        Method m = new Method();

        int n = m.input();
        int count = m.calculate(n);

        System.out.println(count);
    }
}