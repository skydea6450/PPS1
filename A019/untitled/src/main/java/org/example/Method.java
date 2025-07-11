package org.example;

import java.util.Scanner;

public class Method {
    public int input() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a > ");
        a = sc.nextInt();
        System.out.print("Enter the b > ");
        b = sc.nextInt();
        System.out.print("Enter the c > ");
        c = sc.nextInt();

        return a * b * c;
    }

    public void print(int number){
        String word = String.valueOf(number);
        int[] counts = new int[10];

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            switch(ch){
                case '0': counts[0]++; break;
                case '1': counts[1]++; break;
                case '2': counts[2]++; break;
                case '3': counts[3]++; break;
                case '4': counts[4]++; break;
                case '5': counts[5]++; break;
                case '6': counts[6]++; break;
                case '7': counts[7]++; break;
                case '8': counts[8]++; break;
                case '9': counts[9]++; break;
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.println(counts[i]);
        }
    }
}
