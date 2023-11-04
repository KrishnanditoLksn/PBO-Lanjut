package PraktikkumGui_1.Modul9.Latihan1;

import java.io.File;

public class tugas1 {
    public static void main(String[] args) {
        File file = new File("res/sample.txt");

        if (!file.exists()) {
            System.out.println("Maaf file tidak ditemukan di path " + file.getAbsolutePath());
        } else {
            System.out.println("File ditemukan");
        }
    }
}
