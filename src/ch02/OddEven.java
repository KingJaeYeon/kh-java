package ch02;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 :");
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "짝수" : "홀수");
        sc.close();
    }
}
