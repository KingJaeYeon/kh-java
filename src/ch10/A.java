package ch10;

public class A {
    String name = "kim";
    static int n = 20;

    public void print() {
        System.out.println(name);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int a = 10;
        double b = 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(n);
    }
}
