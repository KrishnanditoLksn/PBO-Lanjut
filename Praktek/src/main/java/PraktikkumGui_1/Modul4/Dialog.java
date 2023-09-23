package PraktikkumGui_1.Modul4;

import javax.swing.*;
import java.awt.*;

public class Dialog extends JFrame{
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public Dialog() {
        JDialog jDialog = new JDialog();
        Container container = new Container();
        JButton btn1, btn2;
        JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;
        JTextField jTextField1, jTextField2, jTextField3, jTextField4, jTextField5;

        //Membuat judul untuk dialog
        jLabel1 = new JLabel("Data Manager");
        jLabel1.setBounds(150, 100, 100, 16);
        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        jLabel1.setForeground(Color.GRAY);//mengatur warna latar
        container.add(jLabel1);

        //Membuat nama manajer
        jLabel2 = new JLabel("Nama:");
        jLabel2.setBounds(90, 130, 70, 15);
        container.add(jLabel2);

        //Membuat text field untuk nama manager
        jTextField1 = new JTextField();
        jTextField1.setColumns(25);
        jTextField1.setBounds(135, 130, 150, 15);
        container.add(jTextField1);


        //Membuat isian untuk NIP
        jLabel3 = new JLabel("NIP  :");
        jLabel3.setBounds(90, 155, 70, 15);
        container.add(jLabel3);

        //Membuat textfield untuk nip
        jTextField2 = new JTextField();
        jTextField2.setColumns(100);
        jTextField2.setBounds(135, 155, 150, 15);
        container.add(jTextField2);

        //Membuat Tanggal Lahir
        jLabel4 = new JLabel("Tgl Lahir:");
        jLabel4.setBounds(88, 178, 70, 15);
        container.add(jLabel4);

        //Membuat combo box untuk tanggal
        String[] date = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        JComboBox<String> dateCombo = new JComboBox<>(date);
        dateCombo.setBounds(150, 178, 50, 19);
        container.add(dateCombo);

        //Membuat combo box untuk bulan
        String[] month = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        JComboBox<String> monthCombo = new JComboBox<>(month);
        monthCombo.setBounds(210, 178, 100, 19);
        container.add(monthCombo);

        //Membuat text field untuk tahun
        jTextField3 = new JTextField();
        jTextField3.setColumns(28);
        jTextField3.setBounds(319, 178, 45, 19);
        container.add(jTextField3);

        //Membuat label untuk alamat
        jLabel5 = new JLabel("Alamat:");
        jLabel5.setBounds(90, 200, 50, 19);
        container.add(jLabel5);

        //Membuat text field untuk alamat
        jTextField4 = new JTextField();
        jTextField4.setColumns(100);
        jTextField4.setBounds(133, 205, 145, 15);
        container.add(jTextField4);

        //Membuat label untuk nomor handphone
        jLabel6 = new JLabel("No Handphone:");
        jLabel6.setBounds(42, 223, 100, 15);
        container.add(jLabel6);

        //Membuat textfeld untuk nomor handphone
        jTextField5 = new JTextField();
        jTextField5.setColumns(100);
        jTextField5.setBounds(133, 225, 145, 15);
        container.add(jTextField5);

        //Membuat button "simpan"
        btn1 = new JButton("Simpan");
        btn1.setBounds(120, 250, 80, 30);
        btn1.setBackground(Color.LIGHT_GRAY);
        container.add(btn1);

        //Membuat button "batal"
        btn2 = new JButton("Batal");
        btn2.setBounds(225, 250, 80, 30);
        btn2.setBackground(Color.LIGHT_GRAY);
        container.add(btn2);

        //Mengatur layout pada container dan ukuran kotak dialog
        container.setLayout(null);
        jDialog.add(container);
        jDialog.setBounds(400, 300, 400, 400);
        jDialog.setVisible(true);
        setTitle("Dialog GUI");
        setSize(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        jDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Dialog();
    }
}