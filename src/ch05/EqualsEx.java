package ch05;

import java.util.Scanner;

public class EqualsEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run){
            System.out.print("문자열을 입력해주세요 :");
            //String은 char을 배열호해서 만든 객체이다. 즉 [] = J,a,v,a 처리
            String str = sc.nextLine();//문자열을 라인단위로 읽는 함수
            if (str.equals("exit")){
                break;
            }
            else{
                System.out.println("input : "+ str);
            }
        }
        System.out.println("프로그램 종료");
    }
}
