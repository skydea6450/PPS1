package org.example;

import java.util.*;

public class Method {
    private int count;
    private String[] text;
    Set<String> word = new HashSet<>();

    public void input(){
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        text = new String[count];

        for(int i = 0; i < count; i++){
            text[i] = sc.next();
        }
    }

    private static int sumDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            // 문자가 숫자인지 확인하고, 숫자로 변환하여 더합니다.
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    public void sorting(){
        word.clear();
        word.addAll(Arrays.asList(text));

        Comparator<String> customComparator = Comparator
                .comparingInt(String::length)
                .thenComparingInt(Method::sumDigits)
                .thenComparing(Comparator.naturalOrder());

        word.stream()
                .sorted(customComparator)
                .forEach(System.out::println);
    }
}
