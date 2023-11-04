    package PraktikkumGui_1.Modul9.Latihan3;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class tugas1 {

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File infile = new File(fileChooser.getSelectedFile().getAbsolutePath());

        try {
            inputStream = new FileInputStream(infile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        int fileSize = (int) infile.length();
        byte[] bytesArray = new byte[fileSize];

        try {
            inputStream.read(bytesArray);
            for (int i = 0; i < fileSize; i++) {
                System.out.print((char) bytesArray[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
