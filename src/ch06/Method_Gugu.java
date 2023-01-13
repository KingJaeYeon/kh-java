package ch06;

import java.util.Scanner;

public class Method_Gugu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단을 입력하세요 :");
        gugu(sc.nextInt());
        sc.close();
    }
    public static void gugu(int dan){
        for (int i = 1; i<10;i++){
            System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }
    }
}
