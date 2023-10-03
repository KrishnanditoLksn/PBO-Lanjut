package PraktikkumGui_1.Modul4;

import PraktikkumGui_1.Modul5.SimpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {//Membuat kelas untuk menu

    public Menu() {//Membuat konstruktor menu
        JMenuBar menuBar1 = new JMenuBar();
        JMenu menu1 = new JMenu("Menu");
        JMenuItem menuItem1 = new JMenuItem();
        JMenuItem menuItem2 = new JMenuItem();
        JMenuItem menuItem3 = new JMenuItem();
        JMenuItem menuItem4 = new JMenuItem();
        JPanel jPanel = new JPanel();
        button button = new button();

        //membuat menu untuk karyawan
        menuItem1.setText("Tambah Karyawan");
        menuItem1.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        menuItem1.setBackground(Color.LIGHT_GRAY);
        menuItem1.addActionListener(button);
        menu1.add(menuItem1);

        //membuat menu untuk marketing
        menuItem2.setText("Tambah Marketing");
        menuItem2.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        menuItem2.setBackground(Color.LIGHT_GRAY);
        menuItem2.addActionListener(button);
        menu1.add(menuItem2);
        menu1.addSeparator();

        //membuat menu untuk honorer
        menuItem3.setText("Tambah Honorer");
        menuItem3.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        menuItem3.setBackground(Color.LIGHT_GRAY);
        menuItem3.addActionListener(button);
        menu1.add(menuItem3);

        menuItem4.setText("Program Kalkulator");
        menuItem4.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        menuItem4.setBackground(Color.LIGHT_GRAY);
        menuItem4.addActionListener(button);
        menu1.add(menuItem4);

        //Mengatur jenis font untuk menu
        menu1.setFont(new Font("Segoe UI", Font.BOLD, 12));
        menuBar1.add(menu1);//menambahkan menu1 ke dalam menu bar
        menuBar1.setBackground(Color.GRAY);//mengatur warna background menu bar menjadi abu abu
        jPanel.add(menuBar1);//menambahkan menubar 1 ke dalam panel
        this.setJMenuBar(menuBar1);//menambahkan menubar
        this.setTitle("Test Menu");//mengatur judul pada jframe
        this.add(jPanel);//menambahkan panel ke dalam frame
        this.setSize(400, 400);//mengatur ukuran frame
        this.setVisible(true);//mengatur agar frame bisa terlihat
        this.setResizable(true);//menngatur agar user bisa mengatur ukuran bebas
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Menu();
    }

    //Membuat kelas button yang menggunakan interface action listener
    public static class button implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Program Kalkulator")) {
                SimpleCalculator calculator = new SimpleCalculator();
                calculator.calculatorGui();
            } else {
                //objek dialog akan mengakses method dialogGui
                Dialog dialog = new Dialog();
                dialog.dialogGui();
            }
        }
    }
}
