package PraktikkumGui_1.Modul3;

import javax.swing.*;

public class exercise1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Ini Frame Pertamaku");
        int tinggi = 400;
        int lebar = 400;

        jFrame.setBounds(0, 0, tinggi, lebar);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
