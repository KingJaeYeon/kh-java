package ch05;

public class ArrayTest3 {
    enum Week {월, 화, 수, 목, 금, 토, 일}
    //enum은 배열보다 간편한 방식으로 단지 데이터를 나열해서 쓰기만 하면 된다.

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("합은: " + sum);

        int[][] values = new int[3][];
        values[0] = new int[]{1, 2, 3, 4};
        values[1] = new int[]{5, 6, 7, 8, 9, 10};
        values[2] = new int[]{11, 12, 13};

        for (int[] a : values) {
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        for (Week day : Week.values()) {
            System.out.println(day + "요일");
        }
    }
}
