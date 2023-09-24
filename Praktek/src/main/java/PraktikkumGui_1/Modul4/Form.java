package PraktikkumGui_1.Modul4;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    private static final int FRAME_WIDTH = 350;//Membuat variabel frame width
    private static final int FRAME_HEIGHT = 300;//Membuat variabel frame height
    private static final int BUTTON_HEIGHT = 40;//Membuat variable button height
    private static final int BUTTON_WIDTH = 80;//Membuat variable button width

    public Form() {
        Container contentPane = getContentPane();//Mereturn objek content frame

        //membuat field untuk Nama
        JLabel jLabel1 = new JLabel("Nama :");//Membuat label untuk nama
        JTextField jTextField1 = new JTextField();//Membuat objek untuk teks field 1
        jLabel1.setBounds(22, 30, 90, 15);//Mengatur ukuran posisi label1
        jTextField1.setBounds(117, 30, 150, 15);//Mengatur ukuran posisi teks field 1
        contentPane.add(jLabel1);//Menambahkan jlabel 1 ke dalam container
        contentPane.add(jTextField1);//Menambahkan teks field 1 ke dalam container

        //membuat field untuk jenis kelamin
        JLabel jLabel2 = new JLabel("Jenis Kelamin : ");//Membuat objek label jenis kelamin
        jLabel2.setBounds(22, 50, 90, 15);//Mengatur ukuran posisi label 2
        contentPane.add(jLabel2);//Menambahkan label 2 ke dalam container


        String[] jenisKelamin = {"COWOK", "CEWEK"};//Membuat array jenis kelamin bertipe string
        ButtonGroup buttonGroup = new ButtonGroup();//Membuat objek button group
        int lebar = 110;//Membuat variabel lebar
        for (String string : jenisKelamin) {//Melakukan perulangan untuk menambahkan button group dan radio button
            JRadioButton jRadioButton = new JRadioButton(string);
            buttonGroup.add(jRadioButton);
            jRadioButton.setBounds(lebar, 50, 90, 15);
            lebar += 100;
            contentPane.add(jRadioButton);
        }

        //Membuat checkbox hobi
        JLabel jLabel = new JLabel("Hobi : ");
        jLabel.setBounds(20, 68, 90, 15);
        contentPane.add(jLabel);

        //Membuat perulangan untuk menambahkan checkbox hobi ke dalam container
        String[] listHobby = {"Olahraga", "Shopping", "Computer Games", "Nonton Bioskop", "Nonton Anime"};
        int width = 130;
        int height = 15;
        int y = 70;
        for (String counter : listHobby) {
            JCheckBox jCheckBox = new JCheckBox(counter);
            jCheckBox.setBounds(110, y, width, height);
            y += 25;
            contentPane.add(jCheckBox);
        }

        //Membuat ok button
        JButton okButton = new JButton("OK");
        okButton.setBounds(50, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);

        //Membuat cancel button
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(150, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);

        //Mengatur ukuran dari container
        contentPane.setLayout(null);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    //Menampilkan gui
    public static void main(String[] args) {
        Form form = new Form();
        form.setTitle("Input Data");
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}