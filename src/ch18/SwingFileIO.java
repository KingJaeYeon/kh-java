package ch18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SwingFileIO extends JFrame implements ActionListener {
    Container cp ;
    JButton btnSave, btnLoad;
    JTextArea ta;

    public SwingFileIO(){
        super("파일 입출력 예제");
        cp = this.getContentPane();
        this.setBounds(100,100,400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setDesign();

        this.setVisible(true);
    }

    public void setDesign() {
        JPanel pTop = new JPanel();
        btnSave = new JButton("save file");
        btnLoad = new JButton("load file");
        pTop.add(btnSave);
        pTop.add(btnLoad);
        this.add("North",pTop);

        ta = new JTextArea();
        JScrollPane sp =  new JScrollPane(ta);
        this.add("Center",sp);

        btnSave.addActionListener(this);
        btnLoad.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if (ob == btnSave){ //파일 저장가능
            FileDialog fd = new FileDialog(this,"saving file",FileDialog.SAVE);
            fd.setVisible(true);
            String fileName = fd.getDirectory() + fd.getFile();
            if (fd.getFile() == null) return;

            FileWriter fw = null;
            try {
                fw = new FileWriter(fileName);
                fw.write(ta.getText());
                ta.setText("saved");
                fw.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }else if (ob == btnLoad){ //파일 불러오기 기능
            FileDialog dlg = new FileDialog(this,"open file",FileDialog.LOAD);
            dlg.setVisible(true);
            String fileName = dlg.getDirectory() + dlg.getFile();
            if (dlg.getFile()==null) return;
            FileReader fr= null;
            try {
                fr = new FileReader(fileName);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            BufferedReader br = null;
            br = new BufferedReader(fr);
            ta.setText("");//이전글 모두 삭제
            while (true){
                String line = "";
                try {
                    line = br.readLine();
                }catch(Exception e2){
                    e2.printStackTrace();
                }
                if (line == null)break;
                ta.append(line + "\n");
            }
            try {
                br.close();
                fr.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new SwingFileIO();
    }
}
