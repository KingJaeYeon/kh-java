package ch06;

public class VariantParam2 {
    public static void main(String[] args) {
        System.out.println("===상반기목록===");
        print("Java","DB");
        System.out.println();
        System.out.println("===하반기목록===");
        print("HTML","CSS","JSP");
        print(80,90,100);
    }

    static void print(String... n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println("과목 :" + n[i]);
        }
        System.out.println("-------------------");
    }

    static void print(int... n) {
        int tot = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.println("점수 :" + n[i]);
            tot = tot + n[i];
        }
        System.out.println("총점 :" + tot);
        System.out.println("평균 :" + String.format("%.1f", (double) tot / n.length));
    }
}
