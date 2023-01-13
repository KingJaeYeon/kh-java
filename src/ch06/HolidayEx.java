package ch06;

import java.util.Scanner;

public class HolidayEx {
    static int y;// 전역변수, 멤버변수 클래스 전체에서 사용한 변수

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("근속연수를 입력하세요");
        y = sc.nextInt();
        sc.close();
    }

    static int holiday(int year) {
        int day = 0;//day는 지역변수로 해당 메소드에서만 사용가능
        if (year<=5){
            day = 10;
        }else if(year<=10){
            day = 15;
        }else {
            day = 20;
        }
        return day;
    }

    public static void main(String[] args) {
        input();
        System.out.print("휴가일수 :"+holiday(y));
    }
}
