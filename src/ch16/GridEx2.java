package ch16;

import javax.swing.*;
import java.awt.*;

public class GridEx2 extends JFrame {
    public GridEx2(){
        super("GridLayout 예제2");
        setLayout(new GridLayout(3,3)); //3행 3열의 그리드레이아웃 설정
        for (int i = 1 ; i<=9;i++){
            JButton btn = new JButton("button"+i);
            add(btn);
        }
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridEx2();
    }
}
