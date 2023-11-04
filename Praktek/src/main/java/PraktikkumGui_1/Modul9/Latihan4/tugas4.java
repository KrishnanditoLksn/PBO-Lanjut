package PraktikkumGui_1.Modul9.Latihan4;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fileOutputStream;
        JFileChooser fileChooser = new JFileChooser();

//        fileChooser.showSaveDialog(null);
        String info = scanner.nextLine();
        File outputFile = new File("res/ucob.txt");
        try {
            fileOutputStream = new FileOutputStream(outputFile);
            fileOutputStream.write(info.getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        int userSaver = fileChooser.showSaveDialog(null);
        if (userSaver == JFileChooser.APPROVE_OPTION) {

            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            // Lakukan penyimpanan file ke filePath
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(info);
                writer.close();
                System.out.println("File sudah  berhasil disimpan: " + filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }   
        }
    }
}
