package org.example;

import java.util.Scanner;

public class Method {
    public void input(){
        Scanner sc = new Scanner(System.in);
        int sum1 = 0, sum2 = 0;

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++){
            System.out.print("Enter the count > ");
            int count = sc.nextInt();
            sum1 += count / 30 * 10 + 10;
            sum2 += count / 60 * 15 + 15;
        }

        int min = Math.min(sum1, sum2);

        if(min == sum1 && min == sum2){
            System.out.println("Y M " + min);
        }else if(min == sum1){
            System.out.println("Y " + min);
        }else{
            System.out.println("M " + min);
        }
    }
}
