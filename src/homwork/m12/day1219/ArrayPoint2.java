package homwork.m12.day1219;

import java.util.Scanner;

public class ArrayPoint2 {
    public static void main(String[] args) {
        String[][] studentScore = new String[2][6];
        String[] str = new String[]{"이름을 입력하세요:", "국어점수:", "영어점수:", "수학점수:" };
        int sum = 0;
        double avg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요");

        for (int i = 0; i < studentScore.length; i++,sum=0) {

            for (int j = 0; j < str.length; j++) {
                System.out.printf("%s",str[j]);
                studentScore[i][j] = sc.nextLine();
                if (j>=1){
                    sum+=Integer.parseInt(studentScore[i][j]);
                }
            }
            avg += sum/3.0;
            studentScore[i][4] = String.valueOf(sum);
            studentScore[i][5] = String.format("%.1f",(double) sum/3.0);
            System.out.println();
        }

        String[] s = new String[]{"이름:","국어:","영어:","수학:","총점:","평균:"};
        for (String[] strings : studentScore) {
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i] + strings[i]);
            }
            System.out.println();
        }
        System.out.println("============================================");
        System.out.println("학급평균:"+String.format("%.1f",avg/2.0));
    }
}
