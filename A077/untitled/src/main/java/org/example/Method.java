package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Method {
    private int[] x = new int [8];

    public void input(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 8; i++){
            x[i] = sc.nextInt();
        }
    }

    public void calculate() {
        int[][] indexedValues = new int[x.length][2];
        for (int i = 0; i < x.length; i++) {
            indexedValues[i][0] = x[i];
            indexedValues[i][1] = i + 1;
        }

        Arrays.sort(indexedValues, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        int sumOfTop5 = 0;
        int[] top5OriginalIndices = new int[5];

        for (int i = 0; i < 5; i++) {
            sumOfTop5 += indexedValues[i][0];
            top5OriginalIndices[i] = indexedValues[i][1];
        }

        System.out.println(sumOfTop5);

        Arrays.sort(top5OriginalIndices);
        for (int i = 0; i < top5OriginalIndices.length; i++) {
            System.out.print(top5OriginalIndices[i]);
            if (i < top5OriginalIndices.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


