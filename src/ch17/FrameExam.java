package ch17;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameExam {
    public static void main(String[] args) {
        Frame f = new Frame("프레임 테스트"); //프레임 생성
        f.setSize(200,300); // 프레임 사이즈 설정
        f.setVisible(true);//프레임을 화면에 표시
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //프로그램 종료
                //정상종료 : 0 , 비정상종료 : -1
                System.exit(0);
            }
        });
    }
}
