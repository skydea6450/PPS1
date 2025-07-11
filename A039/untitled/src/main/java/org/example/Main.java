package org.example;

import java.util.Scanner;

public class Main {
    private int number;

    public static void main(String[] args) {
        Main m = new Main();

        m.input();
        m.print();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number > ");
        number = sc.nextInt();
    }

    public void print(){
        if (number < 0) {
            System.out.println("false");
            return;
        }
        if (number == 0) {
            System.out.println("true");
            return;
        }

        int currentOdd = 1;
        int currentSumOfOdds = 0;

        while (currentSumOfOdds < number) {
            currentSumOfOdds += currentOdd;
            currentOdd += 2;
        }

        if (currentSumOfOdds == number) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

