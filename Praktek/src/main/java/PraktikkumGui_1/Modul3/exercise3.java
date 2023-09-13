package PraktikkumGui_1.Modul3;

import javax.swing.*;

public class exercise3 extends JFrame {
    public exercise3() {
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini class turunan dari JFrame");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new exercise3();
    }
}
