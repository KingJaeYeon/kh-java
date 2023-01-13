package ch18;

import java.io.IOException;
import java.io.InputStream;

//~Stream 객체들은 1byte 단위로 스트림 처리하며, 영무 대소문자, 숫자, 특수문자만 처리할 수 있다.(한글처리불가)
//InputStream, OutputStream
public class InputStreamEx1 {
    public static void main(String[] args) {
        InputStream is =  System.in;//대표적으로 System.in은 InputStream 이다.
        System.out.print("문자를 입력하세요 : ");
        //입력출, 네트워크, DB는 필수적 예외처리
        try {
            //키보드로부터 1byte 읽음, 따하서 한글(2byte)처리가 안됨
            //==> InputStreamReader 를 써야함
            int code = is.read();
            //모든 문자에는 고유한 숫자코드가 있다. 따라서 int형 code를 char형으로 형변환해서 코드값을 문자값으로 볼 수도 있다.
            char ch = (char) code;
            System.out.println("char : " + ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
