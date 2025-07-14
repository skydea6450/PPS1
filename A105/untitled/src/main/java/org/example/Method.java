package org.example;

import java.util.Scanner;

public class Method {
    private int x;

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number > ");
        x = sc.nextInt();
    }

    public void calDivide(){
        int K = 1;
        int sum = 0;

        while (sum + K < x) {
            sum += K;
            K++;
        }

        int orderInGroup = x - sum;

        int numerator, denominator;


        if (K % 2 == 1) {
            numerator = K - orderInGroup + 1;
            denominator = orderInGroup;
        } else {
            numerator = orderInGroup;
            denominator = K - orderInGroup + 1;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
