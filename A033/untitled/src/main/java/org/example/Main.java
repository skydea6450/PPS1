package org.example;

import java.util.Scanner;

public class Main {
    private int[][] jumsu;
    private int index;
    private int total[];
    private int max;

    public static void main(String[] args) {
        Main m = new Main();

        m.input();
        m.calculate();

        m.index = m.index + 1;
        System.out.println(m.index + " " + m.max);
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        jumsu = new int[5][4];
        total = new int[5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                jumsu[i][j] = sc.nextInt();
                total[i] += jumsu[i][j];
            }
        }
    }

    public void calculate() {
        max = total[0];
        for(int i = 1; i < 5; i++){
            max = Math.max(max, total[i]);
            if(max == total[i]){
                index = i;
            }
        }
    }
}