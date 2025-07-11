package org.example;

import java.util.*;

public class Method {
    public int random(){
        Random r = new Random();

        return r.nextInt(10);
    }

    public int cal(int[] number){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            count += (int) Math.pow(number[i], 2);
        }

        return count % 10;
    }
}
