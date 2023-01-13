package ch18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx2 {
    public static void main(String[] args) {
        int var = 0;
        //new InputStreamReader(InputStream)
        Reader input = new InputStreamReader(System.in); //System.in은 대표적인 InputStream
        System.out.println("입력하세요 : ");
        try {
            while (var != 10) {
                var = input.read(); //1문자를 읽어드림
                System.out.println(var + "==>" + (char) var);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
