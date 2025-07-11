package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method method = new Method();
        int number = 0;
        int arr[];

        System.out.print("Enter the n: ");
        number = sc.nextInt();

        arr = new int[number];

        arr = method.ArrayInput(arr, number);
        arr = method.ArrayMath(arr);
        method.printArray(arr);
    }
}