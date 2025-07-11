package org.example;

import java.util.Scanner;

public class Method {
    private String[] word;

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer > ");
        int number = sc.nextInt();
        word = new String[number];
        sc.nextLine();
        for(int i = 0; i < number; i++){
            word[i] = sc.nextLine();
        }
    }

    public void print(){
        int count = 0;
        int jumsu = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < word[i].length(); j++){
                char ch = word[i].charAt(j);
                if(ch == 'O'){
                    count++;
                    jumsu += count;
                }else if(ch == 'X'){
                    count = 0;
                }
            }
            System.out.println(jumsu);
            jumsu = 0;
            count = 0;
        }
    }
}
