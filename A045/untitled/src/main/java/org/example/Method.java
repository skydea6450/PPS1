package org.example;

import java.util.Scanner;

public class Method {
    private String word = "";
    private int[] count = new int[26];

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        word = sc.nextLine();
        checkAlp(word);
    }

    public void checkAlp(String word){
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                count[ch - 'a']++;
            }
        }
    }

    public void print(){
        int maxCount = 0;
        char resultChar = '?';
        boolean isDuplicateMax = false;

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] == maxCount) {
                if (!isDuplicateMax) {
                    resultChar = (char) ('A' + i);
                    isDuplicateMax = true;
                } else {
                    System.out.println("?");
                    return;
                }
            }
        }

        System.out.println(resultChar);
    }
}
