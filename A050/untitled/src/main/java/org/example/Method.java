package org.example;

import java.util.Scanner;

public class Method {
    private String word;
    private String text;

    public void input(){
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        changeWord();
    }

    public void changeWord(){
        text = "";
        int Index = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.toUpperCase().charAt(i); //
            // 알파벳의 변환을 어떻게 하는 부분을 다시 한번 생각해 봐야 한다.
                if(ch >= 'A' && ch <= 'Z'){
                    int currentAlphaIndex = ch - 'A';
                    int shiftedIndex = currentAlphaIndex - 3;
                    Index = (shiftedIndex % 26 + 26) % 26;
                }
            text += (char)('A' + Index);
        }
    }

    public void print(){
        System.out.println(text);
    }
}
