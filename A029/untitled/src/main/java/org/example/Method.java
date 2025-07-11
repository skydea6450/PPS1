package org.example;

import java.util.Scanner;

public class Method {

    public int[] input() {
        int[] openMethod;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number(0, 1) > ");
        int number = scanner.nextInt();

        openMethod = new int[number];
        openMethod[0] = scanner.nextInt();

        for(int i = 1; i < number; i++) {
            if(openMethod[i-1] == 0) {
                openMethod[i] = 1;
            }else{
                openMethod[i] = 0;
            }
        }

        return openMethod;
    }

    public void checkMethod(int[] openMethod) {
        boolean check2x = true;
        boolean check3x = true;

        for(int i = 0; i < openMethod.length - 2; i+=2) {
            if(openMethod[i] != openMethod[i+2]) {
                check2x = false;
                break;
            }
        }

        for(int i = 0; i < openMethod.length - 3; i+=3) {
            if (openMethod[i] != openMethod[i + 3]) {
                check3x = false;
                break;
            }
        }


        if(check2x || check3x){
            for(int i = 1; i < openMethod.length; i++) {
                System.out.println(openMethod[i]);
            }
            System.out.println();
        }else {
            System.out.println("Love is open door");
        }
    }
}
