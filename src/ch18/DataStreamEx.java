package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {
    public static void main(String[] args) {
        try {
            //DataOutputSteam 은 이진파일(binary file) 처리하는 객체
            DataOutputStream dataout = new DataOutputStream(
                    new FileOutputStream("C:\\Users\\PJY\\IdeaProjects\\hello-spring\\javaProject1213\\test.dat"));
            dataout.writeInt(123);//숫자 형식의 자료를 파일에 저장
            dataout.writeChar('A');// 문자 형식의 자료를 파일에 저장
            dataout.writeDouble(3.5); // 실수 형식
            dataout.close(); //스트림 닫기 (파일이 완성됨)
            System.out.println("저장되었습니다.");

            //DataInputSteam : 이진파일 읽기 위한 객체
            DataInputStream dataInput = new DataInputStream(
                    new FileInputStream("C:\\Users\\PJY\\IdeaProjects\\hello-spring\\javaProject1213\\test.dat"));
            System.out.println(dataInput.readInt());
            System.out.println(dataInput.readChar());
            System.out.println(dataInput.readDouble());
            dataout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
