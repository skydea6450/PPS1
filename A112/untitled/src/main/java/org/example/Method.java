package org.example;

import java.util.Scanner;

public class Method {
    private int N, M;
    private int[][] arr;
    private int total = 0;

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the N, M > ");
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M][2];
        for (int i = 0; i < M; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
    }

    public void calculate(){
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;
        int temp = N / 6;
        int temp1 = N % 6;
        if(M != 1) {
            for (int i = 0; i < M; i++) {
                min = Math.min(min, arr[i][0]);
                min1 = Math.min(min1, arr[i][1]);
            }
        }else{
            min = arr[0][0];
            min1 = arr[0][1];
        }

        if(N >= 6){
            total += temp * min;
            if(temp1 * min1 > min){
                total += min;
            }else{
                total += temp1 * min1;
            }
        }else{
            if(temp1 * min1 > min){
                total += min;
            }else{
                total += temp1 * min1;
            }
        }
    }

    public void print(){
        System.out.println(total);
    }
}
