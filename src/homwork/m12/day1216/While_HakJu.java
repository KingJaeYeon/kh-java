package homwork.m12.day1216;

import java.util.Scanner;

public class While_HakJu {
    public static void main(String[] args) {
        System.out.println("전체 성적입력이 끝나면 마지막에 -1을 입력하세요");
        boolean run = true;
        int kor;
        int eng;
        int math;
        int sum;
        String str = "";
        String[] s = new String[]{"수","우","미","양","가"};

        Scanner sc = new Scanner(System.in);
        while (run){
            System.out.print("아무정수나 입력하세요 :");
            int num = sc.nextInt();

            if (num == -1) break;
            System.out.print("국어 :");
            kor = sc.nextInt();
            System.out.print("영어 :");
            eng = sc.nextInt();
            System.out.print("수학 :");
            math = sc.nextInt();
            sum = kor+eng+math;
            str += kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+String.format("%.1f",(double)sum/3.0)+"\t"+s[(int)(Math.random()*5)]+"\n";
        }
        System.out.println("=============================");
        System.out.println("국어 영어 수학 총점 평균 등급 ");
        System.out.println("-----------------------------");
        System.out.println(str);


    }
}
