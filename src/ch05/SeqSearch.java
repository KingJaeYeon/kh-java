package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        int s[] = new int[10];
        for (int i = 0; i < s.length; i++) {
            int input = i * 10;
            s[i] = input;
        }

        int value, index = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(s));
        System.out.print("위 숫자 중 탐색 할 값을 입력하시오 :");
        value = sc.nextInt();
        sc.close();
        for (int i = 0; i < s.length; i++) {
            if (value == s[i]) {
                index = i;
            }
        }
        if (index >= 0) {
            System.out.println(value + "값은 index " + index + "의 위치에 있습니다.");
        }
    }
}
