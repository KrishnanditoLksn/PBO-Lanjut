package PraktikkumGui_1.Modul3;

import javax.swing.*;

public class FindGui {

    public static void main(String[] args) {
        getjFrame();
    }

    public static void getjFrame() {
        JFrame jFrame = new JFrame();
        JPanel jPanel1 = new JPanel();
        JButton jButton1 = new JButton();
        JLabel jLabel1 = new JLabel();
        JTextField jTextField1 = new JTextField();
        jLabel1.setText("Keyword: ");
        jTextField1.setColumns(23);
        jButton1.setText("Find");
        jFrame.setTitle("Find");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel1.add(jLabel1);
        jPanel1.add(jTextField1);
        jPanel1.add(jButton1);
        jFrame.setBounds(100, 100, 300, 200);
        jFrame.setResizable(true);
        jFrame.setVisible(true);
        jFrame.add(jPanel1);
    }

}
