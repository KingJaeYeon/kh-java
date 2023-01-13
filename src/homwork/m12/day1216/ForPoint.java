package homwork.m12.day1216;

import java.util.Scanner;

public class ForPoint {
    public static void main(String[] args) {
        int kor;
        int eng;
        int math;
        int sum;
        String str = "";
        String[] s = new String[]{"수","우","미","양","가"};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("국어 :");
            kor = sc.nextInt();
            System.out.print("영어 :");
            eng = sc.nextInt();
            System.out.print("수학 :");
            math = sc.nextInt();
            sum = kor+eng+math;
            str += kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+sum/3+"\t"+s[i]+"\n";
        }
        System.out.println("=============================");
        System.out.println("국어 영어 수학 총점 평균 등급 ");
        System.out.println("-----------------------------");
        System.out.println(str);
    }

}
