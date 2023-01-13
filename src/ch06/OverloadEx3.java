package ch06;

public class OverloadEx3 {
    public static void main(String[] args) {
        print("홍길동", "wod@gmail.com", "010-1234-5678");
        print("이순신", 99, 87, 76);
        print("김과장", 560);
    }

    static void print(String name, int sale) {
        double tax = sale * 0.3;
        double pay = sale - tax;
        System.out.println("=================================");
        System.out.printf("%s %5s %4s %5s\n", "이름", "월급", "세금", "실수령액");
        System.out.printf("%s %4d %7.1f %6.1f\n", name, sale, tax, pay);
    }

    static void print(String name, String email, String hp) {
        System.out.println("=================================");
        System.out.printf("%s %8s %10s\n", "이름", "이메일", "전화");
        System.out.printf("%s %3s %2s\n", name, email, hp);
    }

    static void print(String name, int kor, int eng, int mat) {
        int sum = kor + eng + mat;
        System.out.println("=================================");
        System.out.printf("%s %4s %3s %3s %3s %3s\n", "이름", "국어", "영어", "수학", "총점", "평균");
        System.out.printf("%s %3d %4d %4d %5d %5.1f\n", name, kor, eng, mat, sum, sum / 3.0);
    }
}
