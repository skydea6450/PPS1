package org.example;

import java.util.Scanner;

public class Main {
    private int n;
    private int m;

    public static void main(String[] args) {
        Main main = new Main();

        main.input();
        int number = main.calculate();
        System.out.println(number);
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size > ");
        n = sc.nextInt();
        m = sc.nextInt();
    }

    public int calculate(){
        int dividenumber = 0;
        dividenumber = (n * m) -1;
        return dividenumber;
    }
}