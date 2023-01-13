package ch16;

import javax.swing.*;
import java.awt.*;

public class EventEx2 extends JFrame {
    private JButton[] btn = new JButton[6];
    private String[] str = {"Red","Green","Blue","White","Yellow","Cyan"};
    public EventEx2(){
        //FlowLayout 으로 변경
        setLayout(new FlowLayout());
        for (int i = 0 ; i < btn.length ; i++){
            btn[i] = new JButton(str[i]);
            //프레임에 버튼추가
            add(btn[i]);
        }
        //버튼 클릭시 이벤트 기능 추가
        btn[0].addActionListener(new MyColorAction(this,Color.red));
        btn[1].addActionListener(new MyColorAction(this,Color.green));
        btn[2].addActionListener(new MyColorAction(this,Color.blue));
        btn[3].addActionListener(new MyColorAction(this,Color.white));
        btn[4].addActionListener(new MyColorAction(this,Color.yellow));
        btn[5].addActionListener(new MyColorAction(this,Color.cyan));
        //버튼을 누루면 MyColorAction 클래스에서 구현한 actionPerformed()가 호출
        //
        //

        setSize(450,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //현재 창만 닫음
    }

    public static void main(String[] args) {
        new EventEx2();
    }
}
