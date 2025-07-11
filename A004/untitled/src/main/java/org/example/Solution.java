package org.example;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        if (list.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            Arrays.sort(answer);
            return answer;
        }
    }

    public int[] InputArr(int[]arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the number: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void printArr(int[] arr){
        if(arr.length == 0){
            System.out.print("[-1]");
        }else {
            System.out.print("[");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                    if (i != arr.length - 1) {
                        System.out.print(",");
                    }
                }
                System.out.print("]");
        }
    }

}
