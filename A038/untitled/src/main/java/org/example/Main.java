package org.example;

import java.util.Scanner;

public class Main {
    private int number;
    private int sum;

    public static void main(String[] args) {
        Main main = new Main();

        main.input();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number > ");
        number = sc.nextInt();
        sum = (int) Math.sqrt(number);

        System.out.println(sum);
    }
}