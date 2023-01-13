package ch18;

import java.io.IOException;

public class InputStreamEx2 {
    public static void main(String[] args) {
        int var = 0 ;
        try {
            System.out.print("내용을 입력하세요 : ");
            while (var != 10){ //엔터키(10)을 입력할 때까지 반복
                var = System.in.read();
                System.out.println(var + "==>" + (char)var);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
