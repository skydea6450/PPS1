package org.example;

import org.example.Method;

public class Main {
    public static void main(String[] args) {
        Method method = new Method();
        int n = 0;
        int ans[][];
        int arr[];

        n = method.input();
        ans = new int[n][];

        for(int i = 0; i < n; i++) {
            arr = method.NumberArr(i+1);
            if(i == 0 || i == 1){

            }else{
                arr = method.Number(arr, ans[i-1]);
            }
            ans[i] = arr;
        }
        method.printArray(ans);
    }
}