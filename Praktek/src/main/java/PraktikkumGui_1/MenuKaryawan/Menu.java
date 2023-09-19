package PraktikkumGui_1.MenuKaryawan;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    public Menu() {
        JMenuBar menuBar1 = new JMenuBar();
        JMenu menu1 = new JMenu("Menu");
        JMenuItem menuItem1 = new JMenuItem();
        JMenuItem menuItem2 = new JMenuItem();
        JMenuItem menuItem3 = new JMenuItem();
        JMenuItem subMenuItem1 = new JMenuItem();
        JMenu submenu1 = new JMenu();
        JPanel jPanel = new JPanel();

        //membuat menu untuk karyawan
        menuItem1.setText("Tambah Karyawan");
        menuItem1.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        menuItem1.setBackground(Color.LIGHT_GRAY);
        menu1.add(menuItem1);
        menu1.addSeparator();

        //membuat menu untuk marketing
        menuItem2.setText("Tambah Marketing");
        menuItem2.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        menuItem2.setBackground(Color.LIGHT_GRAY);
        menu1.add(menuItem2);
        menu1.addSeparator();

        //membuat menu untuk honorer
        menuItem3.setText("Tambah Honorer");
        menuItem3.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        menuItem3.setBackground(Color.LIGHT_GRAY);
        menu1.add(menuItem3);
        menu1.addSeparator();

        menu1.setFont(new Font("Segoe UI", Font.BOLD, 12));
        menuBar1.add(menu1);
        menuBar1.setBackground(Color.GRAY);
        jPanel.add(menuBar1);
        this.setJMenuBar(menuBar1);
        this.setTitle("Test Menu");
        this.add(jPanel);
        this.setSize(400, 400);
        this.setVisible(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Menu();
    }
}
