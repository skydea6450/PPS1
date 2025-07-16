package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    private int count;
    private int[] weight;
    private long maxWeight = 0;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        count = sc.nextInt();
        weight = new int[count];
        for(int i = 0; i<count; i++){
            weight[i] = sc.nextInt();
        }
    }

    public void calculate(){
        ArrayList<Integer> weightList = new ArrayList<>();
        for (int w : weight) {
            weightList.add(w);
        }

        int numberOfRopes = weightList.size();

        for (int i = 0; i < numberOfRopes; i++) {
            long currentRopeWeight = weightList.get(i);

            long ropesInUse = numberOfRopes - i;

            long currentTotalWeight = currentRopeWeight * ropesInUse;

            if (currentTotalWeight > maxWeight) {
                maxWeight = currentTotalWeight;
            }

        }
    }

    public void print(){
        System.out.println(maxWeight);
    }
}
