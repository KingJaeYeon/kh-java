package ch02;

public class VarScope {
    static int  x; // 전역변수는 자동 0초기화

    public static void main(String[] args) {
        int y = 5;
        System.out.println(x);
        System.out.println(y);
    }
}
