package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Method {
    private int number;
    private int[] age;
    private String[] name;

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number > ");
        number = sc.nextInt();
        age = new int[number];
        name = new String[number];

        for(int i = 0; i < number; i++){
            System.out.print("Enter the age, name > ");
            age[i] = sc.nextInt();
            name[i] = sc.next();
        }

        sort();
        sc.close();
    }

    public void sort(){
        int[] temp;
        temp = Arrays.copyOf(age, age.length);
        Arrays.sort(temp);
        int outputCount = 0;

        boolean[] isPrinted = new boolean[age.length];

        for(int i = 0; i < temp.length; i++){
            if(outputCount >= 3){
                break;
            }
            for(int j = 0; j < age.length; j++){
                if(temp[i] == age[j] && !isPrinted[j]){
                    System.out.println(temp[i] + " " + name[j]);
                    isPrinted[j] = true;
                    outputCount++;

                    if(outputCount >= 3){
                        break;
                    }
                }
            }
        }
    }
}
