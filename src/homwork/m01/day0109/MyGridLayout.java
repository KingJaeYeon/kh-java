package homwork.m01.day0109;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyGridLayout extends JFrame {

    public MyGridLayout(){
        super("MyGridLayout 과재");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = getContentPane();
        JPanel jp1 = new JPanel(new GridLayout(2,2));
        JPanel jp2 = new JPanel(new GridLayout(2,2));
        c.setLayout(new GridLayout(2,1));
        jp1.add(new JLabel("id"));
        jp1.add(new JTextField("hong",20));
        jp1.add(new JLabel("비밀번호"));
        jp1.add(new JPasswordField("****",20));
        jp2.add(new JLabel("이메잁"));
        jp2.add(new JTextField("hong@gmail.com",20));
        jp2.add(new JLabel("hp"));
        jp2.add(new JTextField("010-1234-5678",20));
        c.add(jp1);
        c.add(jp2);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridLayout();
    }
}

