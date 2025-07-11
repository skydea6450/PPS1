package org.example;

import java.util.Scanner;

public class Method {
    public int input(int number, int inputnumber, int count){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = sc.nextInt();
        count = 0;
        for(int i = 0; i<number; i++){
            System.out.print("Enter input: ");
            inputnumber = sc.nextInt();
            count += inputnumber;
        }
        count -= number - 1;

        return count;
    }

    public void print(int count){
        System.out.println(count);
    }
}
