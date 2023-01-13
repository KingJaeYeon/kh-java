package ch05;

import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) {
        int total = 0;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        size = sc.nextInt();
        int[] scores = new int[size];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("성적을 입력하세요 :");
            scores[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        System.out.println("평균 성적은 " + total / scores.length + "입니다.");
    }
}
