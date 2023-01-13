package ch02;

/**
 * @author 재연박
 *
 */
public class HelloExam {
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        int i = 20;
        int s;//
        char a;//

        s = sum(i, 10);
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
