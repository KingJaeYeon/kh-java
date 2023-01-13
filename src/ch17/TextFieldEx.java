package ch17;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
    public TextFieldEx(){
        super("TextFieldEx 예제");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("이름"));
        c.add(new JTextField(20)); //텍스트필드의 길이 20
        c.add(new JLabel("학과"));
        c.add(new JTextField("컴퓨터공학과",20));
        c.add(new JLabel("주소"));
        c.add(new JTextField("서울시 강남구 역삼동",20));
        c.add(new JLabel("비번"));
        c.add(new JPasswordField(20));

        setSize(300,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldEx();
    }
}
