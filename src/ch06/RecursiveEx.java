package ch06;

public class RecursiveEx {

    static long fact1(int n) {
        return n == 1 ? 1 : n * fact1(n - 1);
    }

    static long fact2(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fact1(5));
        System.out.println(fact2(5));
    }
}
