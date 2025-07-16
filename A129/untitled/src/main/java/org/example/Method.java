package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Method {
    private int count;
    private int[] number;
    private int sum = 0;

    public void input(){
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        number = new int[count];
        for (int i = 0; i < count; i++) {
            number[i] = sc.nextInt();
        }
        sc.close();
    }

    public void print(){
        System.out.println(sum);
    }

    public void calcuate(){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < count; i++){
            if(number[i] != 0){
                stack.push(number[i]);
            }else{
                stack.pop();
            }
        }
        for(int i = 0; i < stack.size(); i++){
            sum += stack.get(i);
        }
    }
}
