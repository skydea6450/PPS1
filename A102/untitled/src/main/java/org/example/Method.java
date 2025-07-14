package org.example;

import java.util.Scanner;

public class Method {
    private int a, b;
    private int[][] c;

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number1, number2 > ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = new int[a][b];
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                c[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public void changeMatrix(){
        for(int i = 0; i < c.length; i++){
            for(int j = i + 1; j < c[i].length; j++){
                int temp = c[i][j];
                c[i][j] = c[j][i];
                c[j][i] = temp;
            }
        }
    }

    public void printMatrix(){
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
