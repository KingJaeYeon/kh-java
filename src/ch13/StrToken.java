package ch13;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StrToken {
    public static void main(String[] args) {
        String str = "kim,20,180,55,서울,학생";

        String[] items = str.split(",");
        for (String item : items){
            System.out.print(item+ " ");
        }
        System.out.println();

        //StringTokenizer는 String 객체의 split()등의 메소드들 보다 더 다양한 메소드들을 제공한다.
        StringTokenizer st = new StringTokenizer(str,",");
        int cnt = st.countTokens(); //토큰의 개수
        System.out.println("토큰의 개수: "+cnt);
        while (st.hasMoreTokens()){
            String s = st.nextToken();
            System.out.print(s+" ");
        }
    }
}
