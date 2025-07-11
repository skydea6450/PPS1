package org.example;

import org.example.Method;

public class Main {
    public static void main(String[] args) {
        Method m = new Method();
        int[][] jumsu;
        double[] average;

        jumsu = m.input();

        average = m.calculation(jumsu);

        m.print(average, jumsu);
    }
}