package ch18;

import java.io.*;

public class BufferWriterEx {
    public static void main(String[] args) {
//        PrintStream ps = System.out;
//        OutputStream os = ps;
//        OutputStreamWriter osw = new OutputStreamWriter(os);
//        BufferedWriter bw = new BufferedWriter(osw);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("환영합니다.");
            bw.write("Java");
            bw.newLine(); //개행처리 해주는 메소드
            bw.write("World!!");
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
