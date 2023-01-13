package homwork.m12.day1216;

import java.util.Scanner;

public class While_Gugu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 :");
        int a = sc.nextInt();
        int i = 1;
        while (i<10){
            System.out.printf("%d*%d =%d\n",a,i,a*i);
            i++;
        }
    }
}
