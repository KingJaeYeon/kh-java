package homwork.m12.day1221;

import java.util.Scanner;

public class StudentPoint {
    static String[] name = {"홍길동", "사임당", "이순신" };
    static int[] studentId = {1001, 1002, 1003};
    static int[] java = {90, 95, 84};
    static int[] db = {99, 88, 95};
    static int[] html = {99, 88, 95};
    static int[] jsp = {76, 92, 72};
    static int[] total = new int[3];
    static double[] avg = new double[3];

    static int input() {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("전체학생수:");
        c = sc.nextInt();
        sc.close();
        return c;
    }

    static void getTotal(int c){
        for (int i = 0 ; i< c ;i++){
            total[i] = java[i]+db[i]+html[i]+jsp[i];
        }
    }
    static void getAvg(int c){
        for (int i = 0 ;i <c ;i++){
            avg[i] = total[i]/4.0;
        }
    }

    static void printInfo(int c) {
        System.out.println("------------------------------------------");
        System.out.printf("%s %3s %5s %3s %5s %4s%4s%4s\n",
                "학번", "이름", "Java", "DB", "HTML", "JSP", "총점", "평균");
        System.out.println("------------------------------------------");
        for (int i = 0; i < c; i++) {
            System.out.printf("%d %3s %3d %4d %3d %5d %5d %5.1f\n",
                    studentId[i],name[i],java[i],db[i],html[i],jsp[i],total[i],avg[i]);
        }
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        int c = input();
        getTotal(c);
        getAvg(c);
        printInfo(c);
    }
}
