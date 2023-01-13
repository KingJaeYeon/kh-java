package ch17;

import javax.swing.*;
import java.awt.*;

public class FrameColor extends JFrame {
    public FrameColor() throws InterruptedException {
        setVisible(true);
        Container c = getContentPane(); //프레임의 컨텐츠 영역처리
        for (int i = 0; i <= 255; i++) {
            setSize(i*2,i); // 프레임 사이즈
            setLocation(i*2,i);//프레임의 좌표
            c.setBackground(new Color(i,0,0));//배경색상 설정
            Thread.sleep(10);
        }
        for (int i = 0 ; i<=255 ; i++){
            setSize(i*2,1);
            setLocation(i*2,i);
            c.setBackground(new Color(255,i,0));
            Thread.sleep(10);
        }
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//윈도우 닫을시 프로그램 종료

    }

    public static void main(String[] args) throws InterruptedException{
        new FrameColor();
    }
}
