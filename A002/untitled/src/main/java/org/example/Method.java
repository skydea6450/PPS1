package org.example;

import java.util.*;

public class Method {
    Scanner sc = new Scanner(System.in);

    public int input(){
        int n = sc.nextInt();
        return n;
    }

    public int[] NumberArr(int n){
        int arr[];
        arr = new int[n];

        arr[0] = 1;
        arr[arr.length - 1] = 1;

        return arr;
    }

    public int[] Number(int[] arr, int[] arr1){
        if (arr1 == null || arr.length <= 2) {
            return arr;
        }

        for(int i = 1; i < arr.length - 1; i++){
            arr[i] = arr1[i-1] + arr1[i];
        }
        return arr;
    }

    public void printArray(int[][] ans){
        System.out.print("[");

        for(int i = 0; i < ans.length; i++){
            System.out.print("[");
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j]);
                if (j < ans[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("]");
        }
        System.out.println("]");
    }
}
