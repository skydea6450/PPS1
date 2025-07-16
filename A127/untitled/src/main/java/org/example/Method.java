package org.example;

import java.util.Scanner;

public class Method {
    private int count;
    private int[][] number;

    public void input(){
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        number = new int[count][2];
        for(int i = 0; i < count; i++){
            number[i][0] = sc.nextInt();
            number[i][1] = sc.nextInt();
        }
        sc.close();
    }

    public void calculate(){
        for(int i = 0; i < count; i++){
            long a = lcm(number[i][0], number[i][1]);
            System.out.println(a);
        }
    }

    int gcd(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b); // 재귀 호출
        }
    }

    long lcm(int a, int b){
        if (a == 0 || b == 0) {
            return 0;
        }

        return ((long)a * b) / gcd(a, b);
    }
}
