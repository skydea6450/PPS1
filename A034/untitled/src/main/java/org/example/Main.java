package org.example;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private int A;
    Set<Integer> result = new HashSet();

    public static void main(String[] args) {
        Main m = new Main();

        m.input();
        m.print();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            A = sc.nextInt();
            result.add(A%42);
        }
    }

    public void print(){
        System.out.println(result.size());
    }
}