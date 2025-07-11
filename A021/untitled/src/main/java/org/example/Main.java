package org.example;

public class Main {
    private static int number;
    private static int inputNumber;
    private static int count = 0;

    public static void main(String[] args) {
        Method m = new Method();

        count = m.input(number, inputNumber, count);
        m.print(count);
    }
}