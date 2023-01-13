package ch05;

public class AnonymousArray {
    public static void main(String[] args) {
        System.out.println("숫자들의 합: "+sum(new int[]{1,2,3,4}));
    }
    public static int sum(int[] numbers){
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
