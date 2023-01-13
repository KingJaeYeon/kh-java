package ch17;

import javax.swing.*;
import java.awt.*;

public class PanelExam extends JFrame {
    public PanelExam(){
        /*
        패널에는 2개 이상의 컴포넌트를 배치할 수 있기 때문에, 버튼을 패널에 추가 후
        패널을 프레임에 붙여 여러 개의 컴포넌트를 처리할 수 있다.
        */

        JPanel p = new JPanel();//패널생성
        p.setBackground(Color.red);//패널의 배경색상 설정
        //버튼 생성(Swing은 한글처리가 잘된다.)
        JButton b1 = new JButton("버튼1");
        JButton b2 = new JButton("버튼2");
        JButton b3 = new JButton("버튼3");
        JButton b4 = new JButton("버튼4");
        JButton b5 = new JButton("버튼5");
        JButton b6 = new JButton("버튼6");

        //패널에 버튼 추가
        p.add(b1);
        p.add(b6);

        //패널을 BorderLayout 의 북쪽영역에 추가
        add(p,BorderLayout.NORTH);//add(p,"North")
        add(b2); //위치를 생략하면 Center로 배치
        add(b3,"South");
        add(b4,"West");
        add(b5,"East");

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PanelExam();
    }
}
