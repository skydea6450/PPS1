package org.example;

import java.util.Scanner;

public class Solution {
    public String input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public boolean CheckWord(String word){
        int p_count = 0;
        int y_count = 0;

        word = word.toLowerCase();

        for(char c : word.toCharArray()){
            if(c == 'p'){
                p_count++;
            }else if(c == 'y'){
                y_count++;
            }
        }

        return p_count == y_count;
    }
}
