package PraktikkumGui_1.Modul5;

import javax.swing.*;
import java.awt.*;

public class EventWarna {
    private EventWarna() {
        colorGui();
    }

    public static void main(String[] args) {
        new EventWarna();
    }

    private void colorGui() {
        JFrame jFrame = new JFrame();
        JPanel jPanel;
        JButton jButton1, jButton2;
        jPanel = new JPanel();

        jButton1 = new JButton("Kuning");
        jButton1.setBounds(250, 500, 100, 50);
        //bisa diganti dengan lambda expression
        jButton1.addActionListener(e -> {
            jPanel.setBackground(Color.YELLOW);
            jFrame.add(jPanel);
        });

        jButton2 = new JButton("Merah");
        jButton2.setBounds(250, 500, 100, 50);
        jButton2.addActionListener(e -> {
            jPanel.setBackground(Color.RED);
            jFrame.add(jPanel);
        });

        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jFrame.add(jPanel);
        jFrame.setTitle("GUI Event Warna");
        jFrame.setBounds(250, 300, 1000, 500);
        jFrame.setResizable(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
