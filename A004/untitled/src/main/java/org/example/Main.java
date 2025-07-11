package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d;
        int arr[];
        System.out.print("Enter the n: ");

        n = sc.nextInt();
        arr = new int[n];

        Solution sol = new Solution();

        sol.InputArr(arr);

        System.out.print("Enter the divisor: ");
        d = sc.nextInt();

        arr = sol.solution(arr, d);

        sol.printArr(arr);
    }
}