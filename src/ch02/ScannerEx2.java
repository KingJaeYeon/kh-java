package ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.print("나이를 입력하시요 :");
        short age = sc.nextShort();
        System.out.print("현재 가진 현금의 금액을 입력하세요 : ");
        int money = sc.nextInt();
        System.out.print("집에서 직장까지의 거리를 m단위로 입력하세요 :");
        long distance = sc.nextLong();
        System.out.print("신장(키)를 입력하세요 :");
        float height = sc.nextFloat();

    }
}
