package ch17;

import javax.swing.*;
import javax.swing.text.FlowView;
import java.awt.*;

public class FlowLayoutEx1 extends JFrame {
    public FlowLayoutEx1(){
        setTitle("FlowLayout 예제");
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //FlowLayout 설정
        setLayout(new FlowLayout(FlowLayout.RIGHT,30,40));

        //FlowLayout 설정
        setLayout(new FlowLayout());
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));

    }

    public static void main(String[] args) {
        new FlowLayoutEx1();
    }
}
