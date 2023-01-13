package homwork.m12.day1214;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("직사각형의 가로 길이를 입력하세요 : ");
        double r = sc.nextInt();
        System.out.print("직사각형의 세로 길이를 입력하세요 : ");
        double c = sc.nextInt();
        System.out.printf("직사각형의 넓이는 %.1f입니다.", r * c);
    }
}
