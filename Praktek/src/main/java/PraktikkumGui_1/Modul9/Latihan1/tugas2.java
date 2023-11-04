package PraktikkumGui_1.Modul9.Latihan1;

import java.io.File;

public class tugas2 {
    public static void main(String[] args) {
        File file = new File("D:/sample.txt");
        if (!file.exists()) {
            System.out.println("Maaf file tidak ditemukan");

        } else {
            System.out.println("File ditemukan");
            System.out.println("Nama file : " + file.getName());
            System.out.println("Full path : " + file.getAbsolutePath());

        }
    }
}
