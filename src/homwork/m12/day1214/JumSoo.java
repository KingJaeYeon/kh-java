package homwork.m12.day1214;

import java.util.Scanner;

public class JumSoo {
    public static void main(String[] args) {

        String name;
        int java;
        int db;
        int html;
        int jsp;


        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : "); name = sc.nextLine();
        System.out.print("Java : "); java = sc.nextInt();
        System.out.print("DB : "); db = sc.nextInt();
        System.out.print("HTML : "); html = sc.nextInt();
        System.out.print("JSP : "); jsp = sc.nextInt();
        int sum = java+db+html+jsp;
        System.out.println("====================================================");
        System.out.println("이름 \t Java \t DB \t HTML \t JSP \t 총점 \t 평균");
        System.out.println("---------------------------------------------------");
        System.out.println(String.format("%s \t %d \t %d \t %d \t %d \t %d \t %.1f",name,java,db,html,jsp,sum,(double)sum/4.0));
    }
}
