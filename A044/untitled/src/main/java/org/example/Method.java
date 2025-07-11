package org.example;

import java.util.Scanner;

public class Method {
    private String s = "";

    public void input(){
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
    }

    public void checkS(){
        int a[] = new int[3];
        int consecutiveLCount = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.toUpperCase().charAt(i);
            if(c == 'P'){
                a[0]++;
                consecutiveLCount = 0;
            }else if(c == 'A'){
                a[1]++;
                consecutiveLCount = 0;
            }else if(c == 'L'){
                a[2]++;
                consecutiveLCount++;
            }else{
                consecutiveLCount = 0;
            }
        }

        if(a[1] < 2 && consecutiveLCount < 3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
