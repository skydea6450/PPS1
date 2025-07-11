package org.example;

import java.util.Scanner;

public class Method {
    public String input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void CheckSending(String word){
        word = word.replaceAll("\\s", "");

        if(word.equals("12345678")){
            System.out.println("ascending");
        }else if(word.equals("87654321")){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}
