package homwork.m01.day0109;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderWhile{
    public static void main(String[] args) {
        int var = 0;
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        try {
            System.out.print("내용을 입력하세요 : ");
            while (var != 10){ //엔터키(10)을 입력할 때까지 반복
                var = isr.read();
                System.out.println(var + "==>" + (char)var);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
