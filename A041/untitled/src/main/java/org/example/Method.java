package org.example;

import java.util.Scanner;

public class Method {
    public String[] input(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        return a;
    }

    public void changeWord(String[] words){
        for(int i = 0; i < words.length; i++){
            String text = "";
            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(j == 0){
                    text += words[i].toUpperCase().charAt(j);
                }else{
                    text += words[i].toLowerCase().charAt(j);
                }
            }
            words[i] = text;
        }

        for(int i = 0; i < words.length; i++){
            System.out.print(words[i]);
            if(i != words.length - 1){
                System.out.print(" ");
            }
        }
    }
}
