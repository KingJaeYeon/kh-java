package homwork.m01.day0110;

import java.io.*;

public class FileCopy2 {
    public static void main(String[] args) {
        OutputStream os = null;
        String file1 = "C:\\test\\abc.txt";
        String file2 = "C:\\test\\abcCopy.txt";

        BufferedReader bf = null;
        BufferedWriter bw = null;
        String str = "";

        try {
            os = new FileOutputStream(file1);
            System.out.println("입력하세요");
            while (true){
                int ch = System.in.read();
                if (ch == 10 ) break;
                os.write(ch);
            }
            System.out.println("파일이 저장되었습니다.");
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bf = new BufferedReader(new FileReader(new File(file1)));
                bw = new BufferedWriter(new FileWriter(new File(file2)));
                while (true){
                    str = bf.readLine();
                    if (str == null) break;
                    bw.write(str+"\n");
                }
                System.out.println("파일 복사가 완료되었습니다.");
                bf.close();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
