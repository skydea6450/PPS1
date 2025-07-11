package org.example;

import java.util.Scanner;

public class Method {
    private int a, b;
    private int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    public void input(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public void calDay(){
        int sum = 0;
        for(int i = 1; i < a; i++){
            sum += month[i];
        }
        sum += b;

        System.out.println(sum);

        switch(sum%7){
            case 0:
                System.out.println(day[4]);
                break;
            case 1:
                System.out.println(day[5]);
                break;
            case 2:
                System.out.println(day[6]);
                break;
            case 3:
                System.out.println(day[0]);
                break;
            case 4:
                System.out.println(day[1]);
                break;
            case 5:
                System.out.println(day[2]);
                break;
            case 6:
                System.out.println(day[3]);
                break;
        }
    }
}
