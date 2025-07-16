package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Method {
    private int number;
    private int count = 0;

    public void input(){
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
    }

    public void calculate(){
        count = 99;

        for (int i = 100; i <= number; i++) {
            if (i == 1000) {
                break;
            }

            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int ones = i % 10;

            if ((tens - hundreds) == (ones - tens)) {
                count++;
            }
        }
    }

    public void print(){
        if(number <= 99){
            System.out.println(number);
        }else{
            calculate();
            System.out.println(count);
        }
    }
}
