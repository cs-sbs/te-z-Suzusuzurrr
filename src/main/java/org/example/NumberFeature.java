package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑
        for (int i = 1; inputNumber>0; ++i) {
            if(inputNumber%2==i%2) {
                result+=Math.pow(2,i-1);
            }
            inputNumber=inputNumber/10;
        }
        System.out.println(result);
    }
}
