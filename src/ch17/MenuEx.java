package ch17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEx extends JFrame {
    private JMenuItem mie = new JMenuItem();

    public MenuEx(){
        super("Menu 예제");
        createMenu();
        setSize(300,300);
        setVisible(true);
    }

    void createMenu() {
        JMenuBar menuBar = new JMenuBar(); //메뉴바 생성
        JMenu menu = new JMenu("File"); //메뉴 생성
        menu.add(new JMenuItem("Open"));//메뉴에 메뉴아이템 추가
        menu.add(new JMenuItem("Save"));
        menu.add(new JMenuItem("Print"));
        menu.addSeparator(); //메뉴 분리선 추가
        menu.add(mie);
        menuBar.add(menu); // 메뉴바에 메뉴 추가
        menuBar.add(new JMenu("Edit"));
        menuBar.add(new JMenu("Project"));
        menuBar.add(new JMenu("Run"));
        //프레임에 메뉴바 추가(메뉴바는 프레임에만 붙일 수있다.)
        setJMenuBar(menuBar);
        mie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new MenuEx();
    }
}
