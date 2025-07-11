package org.example;

import java.util.Scanner;

public class Main {
    private String[] text;
    private int count;

    public static void main(String[] args) {
        Main m = new Main();

        m.input();
        m.print();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number > ");
        count = sc.nextInt();
        sc.nextLine();

        text = new String[count];
        for(int i = 0; i < count; i++){
            text[i] = sc.nextLine();
        }
    }

    public void print(){
        for(int i = 0; i < count; i++){
            String currentLine = text[i];
            String[] tokens = currentLine.split(" ");

            double currentResult = 0;
            String currentNumberStr = "";

            for(String token : tokens){
                if (token.isEmpty()) continue;

                char firstChar = token.charAt(0);

                if ((firstChar >= '0' && firstChar <= '9') || firstChar == '.') {
                    currentNumberStr += token;
                }
                // 기호 처리
                else if (firstChar == '@') {
                    if (!currentNumberStr.isEmpty()) {
                        currentResult = Double.parseDouble(currentNumberStr);
                        currentNumberStr = "";
                    }
                    currentResult *= 3;
                } else if (firstChar == '%') {
                    if (!currentNumberStr.isEmpty()) {
                        currentResult = Double.parseDouble(currentNumberStr);
                        currentNumberStr = "";
                    }
                    currentResult += 5;
                } else if (firstChar == '#') {
                    if (!currentNumberStr.isEmpty()) {
                        currentResult = Double.parseDouble(currentNumberStr);
                        currentNumberStr = "";
                    }
                    currentResult -= 7;
                } else {
                    System.out.println("경고: 알 수 없는 토큰 또는 기호 '" + token + "'이(가) 무시됩니다.");
                }
            }

            if (!currentNumberStr.isEmpty()) {
                try {
                    currentResult = Double.parseDouble(currentNumberStr);
                } catch (NumberFormatException e) {
                    System.out.println("오류: 유효하지 않은 숫자 형식 '" + currentNumberStr + "'");
                }
            }
            System.out.printf("%.2f\n", currentResult);
        }
    }
}