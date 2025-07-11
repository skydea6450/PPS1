package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Method {
    private int count;
    private int[] number;
    private Set<Integer> set = new HashSet<>();

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        count = sc.nextInt();
        number = new int[count];
        for(int i = 0; i < count; i++){
            number[i] = sc.nextInt();
        }
    }

    public void sort(){
        for(int i = 0; i < count; i++){
            set.add(number[i]);
        }
    }

    public void print(){
        System.out.print(set);
    }
}
