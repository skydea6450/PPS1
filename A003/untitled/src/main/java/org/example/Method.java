package org.example;

import java.util.*;

public class Method {
    Scanner sc = new Scanner(System.in);

    public int[] ArrayInput(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print("Enter number of elements: ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public int[] ArrayMath(int[] arr){
        int result = 0;
        int ans[];

        for(int i = 0; i < arr.length; i++){
            result += arr[i] * Math.pow(10, arr.length - 1 - i);
        }

        result += 1;
        String resultStr = String.valueOf(result);
        int newLength = resultStr.length();
        ans = new int[newLength];

        for(int i = 0; i < arr.length; i++){
            long divisor = (long) Math.pow(10, newLength - 1 - i);

            ans[i] = (int) (result / divisor);
            result %= divisor;

        }
        return ans;
    }

    public void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
