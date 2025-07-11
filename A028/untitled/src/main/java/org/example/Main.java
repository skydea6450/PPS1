package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private BigInteger total;

    public static void main(String[] args) {
        Main main = new Main();

        main.input();

        System.out.println(main.total);
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = new BigInteger(sc.next());
        BigInteger num2 = new BigInteger(sc.next());

        total = num1.add(num2);
        sc.close();
    }
}