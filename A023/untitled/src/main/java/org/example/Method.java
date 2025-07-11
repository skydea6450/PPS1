package org.example;

import java.util.Scanner;

public class Method {
    public int input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number > ");
        int number = sc.nextInt();


        return number;
    }

    public void calculate(int word){
        int currentNumber = word;
        int total;

        while(true){
            if (currentNumber < 10) {
                total = currentNumber;
                break;
            }

            int num1 = currentNumber / 10;
            int num2 = currentNumber % 10;
            total = num1 + num2;

            currentNumber = total;

            if (total < 10) {
                break;
            }
        }

        System.out.println(total);
    }
}
