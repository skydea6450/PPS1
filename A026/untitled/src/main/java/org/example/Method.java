package org.example;

import java.util.Scanner;

public class Method {
    public int input(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number > ");
        number = sc.nextInt();

        return number;
    }

    public void print(int number){
        int a = 0, b = 0;
        a = number / 10;
        b = number % 10;

        int total = a+b;
        if(number % total == 0) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
