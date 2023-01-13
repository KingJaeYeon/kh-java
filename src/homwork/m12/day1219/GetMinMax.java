package homwork.m12.day1219;

public class GetMinMax {
    public static void main(String[] args) {
        int[] arr = new int[]{79, 88, 91, 33, 100, 55, 95};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("최댓값:"+max);
        System.out.println("최솟값:"+min);
    }
}
