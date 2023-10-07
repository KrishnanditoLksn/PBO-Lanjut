package PraktikkumGui_1.Modul6;

import javax.swing.*;

public class Lat3 {
    public static void main(String[] args) {
        int age = 0;
        try {
            String inputStr = JOptionPane.showInputDialog(null, "Masukkan umur anda!");
            age = Integer.parseInt(inputStr);
        } catch (Exception e) {
            System.out.println("Umur anda : " + age + "tahun");
        }
    }
}
