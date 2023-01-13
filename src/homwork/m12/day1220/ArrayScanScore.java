package homwork.m12.day1220;

import java.util.Scanner;

public class ArrayScanScore {
    public static void main(String[] args) {
        int sum = 0;
        int size;

        Scanner sc = new Scanner(System.in);

        System.out.print("성적처리할 학생수를 입력하세요 :");
        size = sc.nextInt();
        int[] score = new int[size];
        for (int n : score) {
            System.out.print("성적을 입력하세요 :");
            n = sc.nextInt();
            sum += n;
        }
        System.out.println("총점은 " + sum + "점 입니다.");
        System.out.printf("평균성적은 %.1f점 입니다.",(double) sum / score.length);
    }
}
