package ch05;

import java.util.Arrays;

public class ArrayCopy__ {
    public static void main(String[] args) {
        int[] list = {10,20,30,40,50};
        System.out.println(list);
        //배열복사 방법 2가지
        //[1]얕은 복사: 배열의 주소값을 공유해서 복사
        int[] numbers = list;
        for (int n : numbers){
            System.out.println(n);
        }
        System.out.println();

        //[2]깊은복사: 새 배열을 만들어서 데이터 자체를 복사
        int[] list_copy = Arrays.copyOf(list,list.length);
        System.out.println(list_copy);
        for (int n : list_copy){
            System.out.println(n);
        }
    }
}
