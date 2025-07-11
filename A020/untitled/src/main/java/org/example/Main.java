package org.example;

public class Main {
    public static void main(String[] args) {
        Method m = new Method();
        int[] count = new int[4];

        count = m.input();
        m.print(count);
    }
}