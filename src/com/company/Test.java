package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        for (int i = 1 ; i<=20;i++){
            switch (i){
                case 5: case 10: case 15: case 20:
                    System.out.println(i + ": 5의 배수입니다.");
                    break;
                default:
                    System.out.println(i+": 5의 배수가 아닙니다.");
            }
        }
    }
}
