package ch16;

import javax.swing.*;
import java.awt.*;

public class GridEx1 extends JFrame {
    public GridEx1(){
        super("GridLayout 예제");
        setLayout(new GridLayout(2,3)); //2행 3열의 그리드레이아웃 설정
        JButton[] btn = new JButton[6];

        for (int i = 0 ; i<btn.length;i++){
            String str = "버튼"+(i+1);
            btn[i] = new JButton(str);
            add(btn[i]);
        }
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridEx1();
    }
}
