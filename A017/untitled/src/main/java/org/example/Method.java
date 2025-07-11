package org.example;

import java.util.Scanner;
import java.lang.Math;

public class Method {
    public int input(){
        System.out.print("Enter the room number > ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public int calculate(int number){
        int[] count = new int[10];
        String word = String.valueOf(number);

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            switch(ch){
                case '0': count[0]++; break;
                case '1': count[1]++; break;
                case '2': count[2]++; break;
                case '3': count[3]++; break;
                case '4': count[4]++; break;
                case '5': count[5]++; break;
                case '6': count[6]++; break;
                case '7': count[7]++; break;
                case '8': count[8]++; break;
                case '9': count[9]++; break;
            }
        }

        int sumOfSixNine = count[6] + count[9];
        int requiredSixNineTiles = (int) Math.ceil((double)sumOfSixNine / 2.0);

        int maxnumber = 0;
        for(int i = 0; i < count.length; i++){
            if (i == 6 || i == 9) {
                continue;
            }
            maxnumber = Math.max(maxnumber, count[i]);
        }

        maxnumber = Math.max(maxnumber, requiredSixNineTiles);

        return maxnumber;
    }
}
