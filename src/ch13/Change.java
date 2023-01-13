package ch13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Change {
    public static void main(String[] args) {
        Integer arr[] = {3,4,5,32,643,31,0,1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
