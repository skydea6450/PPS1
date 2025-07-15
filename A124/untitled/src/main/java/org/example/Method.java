package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {
    private int x;
    private List<Integer> factors = new ArrayList<>();

    public void input(){
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        primeFactorize(x);
        sc.close();
    }

    public List<Integer> primeFactorize(int number) {
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }

        for (int i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        if (number > 1) {
            factors.add(number);
        }

        return factors;
    }

    public void print(){
        System.out.println(factors);
    }

}
