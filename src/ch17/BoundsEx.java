package ch17;

import javax.swing.*;
import java.awt.*;

public class BoundsEx extends JFrame {
    private JButton btn1,btn2,btn3;

    public BoundsEx() throws HeadlessException {
        super("절대좌푝{ 레이아웃");
        setSize(400,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setLayout(null); //절대좌표계를 활용시 레이아웃을 null로 초기화해야함.
        btn1 = new JButton("버튼 1");
        btn2 = new JButton("버튼 2");
        btn3 = new JButton("버튼 3");
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);

        // btn1.setBounds(x,y,width,height);
        btn1.setBounds(20,5,95,30);
        btn2.setBounds(55,45,105,70);
        btn3.setBounds(180,15,105,90);
        //JFrame을 상속받았고 기본값은 BorderLayout. 그리고  BorderLayout 위치설정을 안하면 기본값은 "Center"
        add(p);
    }

    public static void main(String[] args) {
        new BoundsEx();
    }
}
