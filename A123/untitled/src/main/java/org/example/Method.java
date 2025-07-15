package org.example;

import java.util.Scanner;

public class Method {
    private int a;
    private int[] dp;

    public void input(){
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        sc.close();
    }

    public void cal(){
        dp = new int[a + 1];
        dp[1] = 0;

        for (int i = 2; i <= a; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
    }

    public void print(){
        System.out.println(dp[a]);
    }
}
