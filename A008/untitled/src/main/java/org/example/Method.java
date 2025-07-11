package org.example;

import java.util.Scanner;

public class Method {
    public int[][] input(){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int[][] jumsu;

        System.out.print("Enter the test case > ");
        a = sc.nextInt();

        jumsu = new int[a][];

        for(int i = 0;  i < a; i++){
            System.out.print("Enter the person number > ");
            b = sc.nextInt();
            jumsu[i] = new int[b];
            for(int j = 0;  j < b; j++){
                System.out.print("Enter the jumsu > ");
                int c = sc.nextInt();
                jumsu[i][j] = c;
            }
        }

        return jumsu;
    }

    public double[] calculation(int[][] jumsu){
        int total = 0;
        double[] average;

        average = new double[jumsu.length];

        for(int i = 0;  i < jumsu.length;  i++){
            for(int j = 0;  j < jumsu[i].length;  j++){
                total += jumsu[i][j];
            }
            average[i] = (double) total / jumsu[i].length;
            total = 0;
        }

        return average;
    }

    public void print(double[] average, int[][] jumsu){
        int person = 0;

        for(int i = 0; i < average.length; i++){
            for(int j = 0; j < jumsu[i].length; j++){
                if(jumsu[i][j] - average[i] > 0){
                    person++;
                }
            }
            double percentage = (double) person / jumsu[i].length * 100;
            System.out.printf("%.3f", percentage);
            System.out.println("%");
            person = 0;
        }
    }
}
