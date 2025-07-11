package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Method {
    private int x;
    private String a;
    private Integer[] y;

    public void input(){
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        a = String.valueOf(x);
        y = new Integer[a.length()];
        for (int i = 0; i < a.length(); i++) {
            y[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
        }
    }

    public void sortPrint(){
        Arrays.sort(y, Collections.reverseOrder());
        for(int i = 0; i < y.length; i++){
            System.out.print(y[i]);
        }
    }
}
