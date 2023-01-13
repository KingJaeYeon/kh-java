package homwork.m12.day1215;

public class GuguDan3 {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int gugu = j * j;
                System.out.printf("%d*%d=%d ", i, j, gugu);
            }
            System.out.println();
        }
    }
}
