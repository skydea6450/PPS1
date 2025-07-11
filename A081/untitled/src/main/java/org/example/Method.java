package org.example;

import java.util.*;

public class Method {
    private int x;
    private int[] y;

    public void input(){
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = new int[x];
        for (int i = 0; i < x; i++) {
            y[i] = sc.nextInt();
        }
        sc.close();
    }

    public void print(){
        if (y == null || y.length == 0) {
            return;
        }

        // 1. 각 원소의 빈도수 계산 (HashMap 사용)
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : y) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 2. 최대 빈도수 찾기
        int maxFrequency = 0;
        for (int freq : frequencyMap.values()) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }

        // 3. 최대 빈도수를 가진 모든 원소(다수 원소) 찾기
        List<Integer> majorityElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                majorityElements.add(entry.getKey());
            }
        }

        // 4. 결과 출력
        if (majorityElements.size() == 1) {
            System.out.println(majorityElements.get(0));
        } else {
            System.out.println(majorityElements);
        }
    }
}
