package ch17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pizza extends JFrame {
    String[] str ={"치즈","불고기","포테이토","종료"};
    JButton[] jBtn = new JButton[4];
    public Pizza(){
        super("피자 메뉴");
        setSize(500,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        jp1.setBackground(Color.blue);
        jp2.setBackground(Color.cyan);
        jp3.setBackground(Color.GREEN);

        JLabel label = new JLabel("피자종류를 선택하세요");
        jp1.add(label);

        for (int i = 0 ; i<4 ;i++){
            jBtn[i] = new JButton(str[i]);
            //jp2에 버튼추가
            jp2.add(jBtn[i]);
        }
        jp1.add(jp2);
        jp1.add(jp3);

        add(jp1,"North");
        setVisible(true);

        ActionListener handler = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(str[0])){
                    JOptionPane.showMessageDialog(null,str[0]+"피자를 선택하였습니다. \n가격:23,000원"
                            ,str[0]+"피자",JOptionPane.INFORMATION_MESSAGE);
                }
                else if (e.getActionCommand().equals(str[1])){
                    JOptionPane.showMessageDialog(null,str[1]+"피자를 선택하였습니다. \n가격:25,000원"
                            ,str[1]+"피자",JOptionPane.WARNING_MESSAGE);
                }
                else if (e.getActionCommand().equals(str[2])){
                    JOptionPane.showMessageDialog(null,str[2]+"피자를 선택하였습니다. \n가격:23,000원"
                            ,str[1]+"피자",JOptionPane.DEFAULT_OPTION);
                }
                else if (e.getActionCommand().equals(str[3])){
                    JOptionPane.showMessageDialog(null,"프로그램을 정말 종료하시겠습니까?"
                            ,"종료",JOptionPane.OK_OPTION);
                    System.exit(0);
                }
            }
        };
        for (int i = 0 ; i<str.length;i++){
            jBtn[i].addActionListener(handler);
        }
    }

    public static void main(String[] args) {
        new Pizza();
    }
}
