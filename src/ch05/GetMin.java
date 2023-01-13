package ch05;

import com.sun.corba.se.impl.orbutil.closure.Constant;

import java.util.Scanner;

public class GetMin {
    public static void main(String[] args) {
        int s[] = {12,3,19,6,17,8,12,5,3,1,20};
        int n[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("가장 작은 값은 : "+ min(n,sc));
    }
    public static int min(int[] numbers,Scanner sc){
        int min = Integer.MAX_VALUE;
        for (int number : numbers){
            number = sc.nextInt();
            if (min>number){
                min = number;
            }
        }
        return min;
    }
}
