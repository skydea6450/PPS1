package org.example;

import java.util.Scanner;

public class Method {
    private int x;
    private int[] y;

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number > ");
        x = sc.nextInt();

        y = new int[x];
        for(int i = 0; i < x; i++){
            System.out.print("Enter the cost > ");
            y[i] = sc.nextInt();
        }
    }

    public void calculateCost(){
        int total_cost = 0;
        int max_cost = Integer.MIN_VALUE;
        for(int i = 0; i < x; i++){
            total_cost += y[i];
            max_cost = Math.max(max_cost, y[i]);
        }

        total_cost -= max_cost;
        System.out.println("The total cost is " + total_cost);
    }
}
