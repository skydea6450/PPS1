package org.example;

import java.util.Scanner;

import org.example.Solution;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        boolean flag = false;

        Solution sol = new Solution();

        word = sol.input();

        flag = sol.CheckWord(word);

        if(flag){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}