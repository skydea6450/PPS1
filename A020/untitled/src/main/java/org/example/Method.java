package org.example;

import java.util.Scanner;

public class Method {
    public int[] input(){
        Scanner sc = new Scanner(System.in);
        int[] person  = new int[4];
        for(int i = 0; i < 4; i++){
            System.out.print("Enter the out person, in person > ");
            int out_person = sc.nextInt();
            int in_person = sc.nextInt();
            if(i == 0){
                person[i] = in_person;
            }else{
                person[i] = person[i-1] - out_person + in_person;
            }
        }

        return person;
    }

    public void print(int[] person){
        int max = 0;
        for(int i = 0; i < 4; i++){
            if(person[i] > max){
                max = person[i];
            }
        }

        System.out.println(max);
    }
}
