package ch17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaEx extends JFrame {
    private JTextField tf = new JTextField(20);
    private JTextArea ta = new JTextArea(6,20); //6행 20열의 입력창 생성

    public TextAreaEx(){
        super("TextFieldEx 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("입력 후 <Enter>키를 입력하세요"));
        c.add(tf);
        c.add(new JScrollPane(ta)); //textArea는 ScrollPane 과 함께 써야함.

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField) e.getSource();
                ta.append(t.getText()+"\n");
                t.setText("");
            }
        });
        setSize(250,200);
        setVisible(true);
    }


    public static void main(String[] args) {
        new TextAreaEx();
    }
}
