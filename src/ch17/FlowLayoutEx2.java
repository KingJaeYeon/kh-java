package ch17;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx2 extends JFrame {
    JPanel jp; //패널 변수 선언
    JButton[] jb = new JButton[6];
    public FlowLayoutEx2(){
        super("FlowLayout 예제2");
        jp = new JPanel();
        for (int i = 0 ; i<jb.length;i++){
            String str = "버튼"+(i+1);
            jb[i] = new JButton(str);
            jp.add(jb[i]);
        }
        add(jp);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutEx2();
    }
}
