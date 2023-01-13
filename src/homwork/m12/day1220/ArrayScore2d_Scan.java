package homwork.m12.day1220;

import java.util.Scanner;

public class ArrayScore2d_Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생수를 입력하세요 : ");
        int size = sc.nextInt();
        int[][] score = new int[size][3];

        System.out.println("국,영,수 점수를 각각 입력하세요 :");
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d번 학생의 점수 :", i + 1);
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = sc.nextInt();
            }
        }

        int[] sum = new int[score.length];
        char rank;

        System.out.println("번호\t국어\t영어\t수학\t 총점  평균\t등급");
        for (int i = 0; i < score.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
                sum[i] += score[i][j];
            }
            System.out.print(" " + sum[i] + "  ");
            System.out.printf("%.1f", sum[i] / 3.0);
            rank = sum[i] / 3 >= 90 ? 'A' : sum[i] / 3 >= 80 ? 'B' : sum[i] / 3 >= 70 ? 'C' : sum[i] / 3 >= 60 ? 'D' : 'F';
            System.out.println("\t" + rank);
        }

    }
}
