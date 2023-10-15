package PraktikkumGui_1.Modul7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LatEmpat extends JFrame implements ActionListener {
    //membuat objek jpanel
    JPanel jPanel = new JPanel();
    JLabel jLabel1 = new JLabel("No Induk :");//Membuat objek jlabel 1
    JLabel jLabel2 = new JLabel("Nama : ");//Membuat objek jLabel2
    JLabel jLabel3 = new JLabel("Status : ");//Membuat objek jLabel 3
    JButton saveButton = new JButton("Simpan");//Membuat objek button simpan
    JTextField jTextField1 = new JTextField(20);//Membuat objek teks field 1
    JTextField jTextField2 = new JTextField(20);//Membuat objek teks field 2
    JComboBox<String> jComboBox = new JComboBox<>();//Membuat objek combo box

    public LatEmpat() {
        //mengeset layout null
        jPanel.setLayout(null);

        //mengatur bounds label 1
        jLabel1.setBounds(20, 80, 85, 30);
        jPanel.add(jLabel1);

        //mengatur bounds label teks field 1
        jTextField1.setBounds(100, 80, 85, 30);
        jPanel.add(jTextField1);

        //mengatur bounds label 2
        jLabel2.setBounds(20, 120, 85, 30);
        jPanel.add(jLabel2);

        //mengatur bounds teks field 2
        jTextField2.setBounds(100, 120, 85, 30);
        jPanel.add(jTextField2);

        //mengatur bounds label 3
        jLabel3.setBounds(20, 155, 85, 30);
        jPanel.add(jLabel3);

        //menambahkan combobox
        jComboBox.addItem("Mahasiswa");
        jComboBox.addItem("Dosen");
        jComboBox.setBounds(100, 160, 90, 30);
        jPanel.add(jComboBox);
        //mengatur ukuran bounds save button
        saveButton.setBounds(100, 220, 100, 30);
        saveButton.addActionListener(this);
        jPanel.add(saveButton);
        //menambahkan panel ke frame
        this.add(jPanel);
        //mengatur judul gui
        this.setTitle("GUI SEMINAR");
        //mengatur ukuran frame
        this.setBounds(160, 350, 295, 400);
        //mengatur agar gui bisa di close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //membuat method main

    public static void main(String[] args) {
        new LatEmpat().setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {//Mengimplementasikan method action perform
        try {//Error handle untuk combo box
            if (Objects.equals(jComboBox.getSelectedItem(), "Mahasiswa")) {

                String teksNim = jTextField1.getText();//Mendapatkan string teks field 1
                String teksNama = jTextField2.getText();//Mendapatkan string teks field 2
                if (teksNim.length() == 9 && !teksNama.isEmpty()) {
                    if (Integer.parseInt(teksNim.substring(0, 2)) <= 13) {
                        JOptionPane.showMessageDialog(null, "Terima kasih anda sudah mendaftar seminar");
                    } else {
                        throw new Exception(" harus angkatan 2013 kebawah");
                    }
                } else {
                    if (teksNim.isEmpty() || teksNama.isEmpty()) {
                        throw new Exception("Input tidak boleh kosong");//Melempar error ke dalam blok catch
                    } else {
                        throw new NumberFormatException();//Melempar error ke dalam blok catch
                    }
                }
            } else if (Objects.equals(jComboBox.getSelectedItem(), "Dosen")) {//Jika combo box yang dipilih adalah dosen maka boleh mengikuti seminar
                JOptionPane.showMessageDialog(null, "Terima kasih anda sudah mendaftar seminar");
            }
        } catch (NumberFormatException exception) {//handle error untuk number exception
            JOptionPane.showMessageDialog(null, "Format NIM Salah ", "Error", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
        } catch (Exception error) {//handle erro untuk menangkap exception secara umum
            JOptionPane.showMessageDialog(null, error.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}