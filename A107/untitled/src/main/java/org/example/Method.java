package org.example;

import java.util.Scanner;

public class Method {
    private int start_index, end_index;

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an start index and end index > ");
        start_index = sc.nextInt();
        end_index = sc.nextInt();
    }

    public void calculate(){
        int total = 0;
        int i = 1, j = 0;
        int count = 1;

        while(true){
            total += i;
            if(j == end_index - 1){
                break;
            }
            if(count == i){
                count = 1;
                i++;
            }else{
                count++;
            }
            j++;
        }


        int sum = 0;
        i = 1; j = 0; count = 1;
        while(true){
            sum += i;
            if(j == start_index - 2){
                break;
            }
            if(count == i){
                count = 1;
                i++;
            }else{
                count++;
            }
            j++;
        }

        System.out.println(total - sum);
    }
}
