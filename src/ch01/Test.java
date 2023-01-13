package ch01;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        boolean run = true;
        int[] score;
        String n;

        Scanner sc = new Scanner(System.in);


        opening();
        int c = Integer.parseInt(sc.nextLine());

        if (c == 1) {
            System.out.print("학생수>");
            n = sc.nextLine();
            score = new int[Integer.parseInt(n)];

            while (run) {
                opening();
                int j = Integer.parseInt(sc.nextLine());
                if (j == 2) {
                    for (int i = 0; i < score.length; i++) {
                        System.out.printf("score[%d]>",i);
                        score[i] = Integer.parseInt(sc.nextLine());
                    }
                }
                if (j == 3) {
                    for (int i = 0; i < score.length; i++) {
                        System.out.printf("score[%d]>%d\n", i, score[i]);
                    }
                }
                if (j == 4) {
                    int max = score[0];
                    int sum = 0;
                    for (int i = 0; i < score.length; i++) {
                        if (max < score[i])
                            max = score[i];
                        sum+=score[i];
                    }
                    System.out.println("최고 점수:" + max);
                    System.out.println("평균 점수:" + (double) sum / (double) score.length);
                }
                if (j == 5) {
                    break;
                }
            }
        }
        System.out.println("프로그램종료");
    }

    public static void opening() {
        System.out.println("--------------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("--------------------------------------------------");
        System.out.print("선택>");
    }
}
