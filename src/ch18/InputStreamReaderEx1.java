package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
    public static void main(String[] args) {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        System.out.println("한글자를 입력하세요");
        try {
            int code = isr.read();
            System.out.println("code : " + code);
            char ch = (char)code; //문자
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
