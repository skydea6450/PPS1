package org.example;

import java.util.Scanner;

public class Method {
    private int test_case;
    private int[] cases;

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the test case > ");
        test_case = sc.nextInt();
        cases = new int[test_case];
        for(int i = 0; i < test_case; i++){
            cases[i] = sc.nextInt();
        }
    }

    public void calculate(){
        for(int i = 0; i < test_case; i++){
            int person = (int)Math.pow(2, cases[i]) - 1;
            System.out.println(person);
        }
    }
}
