package PraktikkumGui_1.Modul3;

import javax.swing.*;

public class exercise3 extends JFrame {
    public exercise3() {
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini class turunan dari JFrame");
        this.setVisible(true);

        JPanel jPanel = new JPanel();
        JButton jButton = new JButton();
        jButton.setText("Ini tombol");
        jPanel.add(jButton);
        this.setResizable(true);
        this.add(jPanel);
    }

    public static void main(String[] args) {
        new exercise3();
    }
}
